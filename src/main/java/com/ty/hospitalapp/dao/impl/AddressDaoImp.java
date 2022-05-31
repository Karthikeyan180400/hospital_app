package com.ty.hospitalapp.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospitalapp.dao.AddressDao;
import com.ty.hospitalapp.dto.Address;
import com.ty.hospitalapp.dto.Branch;
import com.ty.hospitalapp.services.impl.BranchServicesImp;

public class AddressDaoImp implements AddressDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Address saveAddress(Address address, int branch_id) {
		BranchServicesImp branchServicesImp = new BranchServicesImp();
		Branch branch = branchServicesImp.getBranchById(branch_id);
		address.setBranch(branch);
		entityTransaction.begin();
		entityManager.persist(address);
		entityTransaction.commit();
		return address;
	}

	public Address getAddressById(int id) {
		Address address = entityManager.find(Address.class, id);
		return address;
	}

	public Address getAddressByBranchId(int branch_id) {
		String sql = "select a from Address a";
		Query query = entityManager.createQuery(sql);
		List<Address> addresses = query.getResultList();
		for (Address address : addresses) {
			Branch branch = address.getBranch();
			if (branch.getId() == branch_id) {
				return address;
			}
		}
		return null;
	}

	public Address updateAddress(Address address, int id) {
		Address address2 = entityManager.find(Address.class, id);
		address2.setStreet(address.getStreet());
		entityTransaction.begin();
		entityManager.merge(address2);
		entityTransaction.commit();
		return address2;
	}

	public boolean deleteAddressById(int id) {
		Address address = entityManager.find(Address.class, id);
		if (address != null) {
			entityTransaction.begin();
			entityManager.remove(address);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

}
