package com.ty.hospitalapp.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospitalapp.dao.MedOrderDao;
import com.ty.hospitalapp.dto.Encounter;
import com.ty.hospitalapp.dto.MedOrder;
import com.ty.hospitalapp.services.impl.EncounterServicesImp;
import com.ty.hospitalapp.services.impl.PersonServicesImp;

public class MedOrderDaoImp implements MedOrderDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public MedOrder saveMedOrder(MedOrder medOrder, int encounter_id) {
		EncounterServicesImp encounterServicesImp = new EncounterServicesImp();
		Encounter encounter = encounterServicesImp.getEncounterById(encounter_id);
		medOrder.setEncounter(encounter);
		entityTransaction.begin();
		entityManager.persist(medOrder);
		entityTransaction.commit();
		return medOrder;
	}

	public MedOrder getMedOrderById(int id) {
		return entityManager.find(MedOrder.class, id);
	}

	public List<MedOrder> getMedOrdersByEncounterId(int encounter_id) {
		EncounterServicesImp encounterServicesImp = new EncounterServicesImp();
		Encounter encounter = encounterServicesImp.getEncounterById(encounter_id);
		return encounter.getMedOrders();
	}

	public List<MedOrder> getMedOrdersByPersonId(int person_id) {
		PersonServicesImp personServicesImp = new PersonServicesImp();
		List<MedOrder> medOrders = new ArrayList<MedOrder>();
		List<Encounter> encounters = personServicesImp.getPersonEncountersByPersonId(person_id);
		for (Encounter encounter : encounters) {
			List<MedOrder> medOrders1 = encounter.getMedOrders();
			medOrders.addAll(medOrders1);
		}
		return medOrders;
	}

	public MedOrder updateMedOrder(MedOrder medOrder, int id) {
		MedOrder medOrder1 = entityManager.find(MedOrder.class, id);
		medOrder1.setTotal(medOrder.getTotal());
		entityTransaction.begin();
		entityManager.merge(medOrder1);
		entityTransaction.commit();
		return medOrder1;
	}

	public boolean deleteMedOrderById(int id) {
		MedOrder medOrder = entityManager.find(MedOrder.class, id);
		if (medOrder != null) {
			entityTransaction.begin();
			entityManager.remove(medOrder);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

}
