package com.ty.hospitalapp.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.hospitalapp.dao.EncounterDao;
import com.ty.hospitalapp.dto.Branch;
import com.ty.hospitalapp.dto.Encounter;
import com.ty.hospitalapp.dto.Person;
import com.ty.hospitalapp.services.impl.BranchServicesImp;
import com.ty.hospitalapp.services.impl.PersonServicesImp;

public class EncounterDaoImp implements EncounterDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Encounter createEncounter(int branch_id, int person_id, Encounter encounter) {
		BranchServicesImp branchServicesImp = new BranchServicesImp();
		Branch branch = branchServicesImp.getBranchById(person_id);
		encounter.setBranch(branch);
		PersonServicesImp personServicesImp = new PersonServicesImp();
		Person person = personServicesImp.getPersonById(person_id);
		encounter.setPerson(person);
		entityTransaction.begin();
		entityManager.persist(encounter);
		entityTransaction.commit();
		return encounter;
	}

	public Encounter getEncounterById(int id) {
		Encounter encounter = entityManager.find(Encounter.class, id);
		return encounter;
	}

	public List<Encounter> getEncountersByBranchId(int branch_id) {
		BranchServicesImp branchServicesImp = new BranchServicesImp();
		return branchServicesImp.getBranchEncounters(branch_id);
	}

	public List<Encounter> getEncountersByPersonId(int person_id) {
		PersonServicesImp personServicesImp = new PersonServicesImp();
		return personServicesImp.getPersonEncountersByPersonId(person_id);
	}

	public Encounter updateEncounter(Encounter encounter, int id) {
		Encounter encounter2 = entityManager.find(Encounter.class, id);
		encounter2.setReason(encounter.getReason());
		entityTransaction.begin();
		entityManager.merge(encounter2);
		entityTransaction.commit();
		return encounter2;
	}

	public boolean deleteEncounter(int id) {
		Encounter encounter = entityManager.find(Encounter.class, id);
		if (encounter != null) {
			entityTransaction.begin();
			entityManager.remove(encounter);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

}
