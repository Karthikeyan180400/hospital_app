package com.ty.hospitalapp.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospitalapp.dao.HospitalDao;
import com.ty.hospitalapp.dto.Branch;
import com.ty.hospitalapp.dto.Hospital;
import com.ty.hospitalapp.services.impl.BranchServicesImp;

public class HospitalDaoImp implements HospitalDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Hospital saveHospital(Hospital hospital) {
		entityTransaction.begin();
		entityManager.persist(hospital);
		entityTransaction.commit();
		return hospital;
	}

	public Hospital getHospitalById(int id) {
		Hospital hospital = entityManager.find(Hospital.class, id);
		return hospital;
	}

	public List<Branch> getHospitalBranchesById(int id) {
		Hospital hospital = entityManager.find(Hospital.class, id);
		return hospital.getBranchs();
	}

	public List<Hospital> getAllHospitals() {
		String sql = "select h from Hospital h";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}

	public Hospital updateHospital(Hospital hospital, int id) {
		Hospital hospital2 = entityManager.find(Hospital.class, id);
		return hospital2;
	}

	public boolean deleteHospitalById(int id) {
		Hospital hospital = entityManager.find(Hospital.class, id);
		if (hospital != null) {
			entityTransaction.begin();
			entityManager.remove(hospital);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

}
