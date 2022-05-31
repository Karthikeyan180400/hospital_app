package com.ty.hospitalapp.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospitalapp.dao.ObservationDao;
import com.ty.hospitalapp.dto.Encounter;
import com.ty.hospitalapp.dto.Observation;
import com.ty.hospitalapp.services.impl.EncounterServicesImp;

public class ObservationDaoImp implements ObservationDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Observation createObservation(Observation observation, int encounter_id) {
		EncounterServicesImp encounterServicesImp = new EncounterServicesImp();
		Encounter encounter = encounterServicesImp.getEncounterById(encounter_id);
		observation.setEncounter(encounter);
		entityTransaction.begin();
		entityManager.persist(observation);
		entityTransaction.commit();
		return observation;
	}

	public Observation getObservationById(int id) {
		Observation observation = entityManager.find(Observation.class, id);
		return observation;
	}

	public List<Observation> getObservationsByEncounterId(int encounter_id) {
		Encounter encounter = entityManager.find(Encounter.class, encounter_id);
		return encounter.getObservations();
	}

	public Observation updateObservation(Observation observation, int id) {
		Observation observation2 = entityManager.find(Observation.class, id);
		observation2.setDiscription(observation.getDiscription());
		entityTransaction.begin();
		entityManager.merge(observation2);
		entityTransaction.commit();
		return observation2;
	}

	public boolean deleteObservationById(int id) {
		Observation observation = entityManager.find(Observation.class, id);
		if (observation != null) {
			entityTransaction.begin();
			entityManager.remove(observation);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

}
