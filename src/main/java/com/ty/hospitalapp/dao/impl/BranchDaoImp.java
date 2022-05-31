package com.ty.hospitalapp.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospitalapp.dao.BranchDao;
import com.ty.hospitalapp.dto.Address;
import com.ty.hospitalapp.dto.Branch;
import com.ty.hospitalapp.dto.Encounter;
import com.ty.hospitalapp.dto.Hospital;
import com.ty.hospitalapp.services.impl.AddressServicesImp;
import com.ty.hospitalapp.services.impl.HospitalServicesImp;

public class BranchDaoImp implements BranchDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Branch saveBranch(Branch branch, int hospital_id) {
		HospitalServicesImp hospitalServicesImp = new HospitalServicesImp();
		Hospital hospital = hospitalServicesImp.getHospitalById(hospital_id);
		branch.setHospital(hospital);
		entityTransaction.begin();
		entityManager.persist(branch);
		entityTransaction.commit();
		return branch;
	}

	public Branch getBranchById(int id) {
		Branch branch = entityManager.find(Branch.class, id);
		return branch;
	}

	public Hospital getBranchHospitalById(int id) {
		Branch branch = entityManager.find(Branch.class, id);
		return branch.getHospital();
	}

	public List<Branch> getAllBranch() {
		String sql = "select b from Branch b";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}

	/*
	 * public List<Branch> getHospitalBranches(int hospital_id) { String sql =
	 * "select b from Branch b where b.hospital.hospital_id=?1"; Query query =
	 * entityManager.createQuery(sql); query.setParameter(1, hospital_id); return
	 * query.getResultList();
	 * 
	 * }
	 */

	public Address getBranchAddressById(int id) {
		AddressServicesImp addressServicesImp = new AddressServicesImp();
		return addressServicesImp.getAddressByBranchId(id);
	}

	public List<Encounter> getBranchEncounters(int id) {
		Branch branch = entityManager.find(Branch.class, id);
		return branch.getEncounters();
	}

	public Branch updateBranch(Branch branch, int id) {
		Branch branch2 = entityManager.find(Branch.class, id);
		branch2.setEmail(branch.getEmail());
		entityTransaction.begin();
		entityManager.merge(branch2);
		entityTransaction.commit();
		return branch2;
	}

	public boolean deleteBranchById(int id) {
		Branch branch = entityManager.find(Branch.class, id);
		if (branch != null) {
			entityTransaction.begin();
			entityManager.remove(branch);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

}
