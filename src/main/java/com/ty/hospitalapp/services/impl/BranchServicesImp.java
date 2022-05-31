package com.ty.hospitalapp.services.impl;

import java.util.List;

import com.ty.hospitalapp.dao.impl.BranchDaoImp;
import com.ty.hospitalapp.dto.Address;
import com.ty.hospitalapp.dto.Branch;
import com.ty.hospitalapp.dto.Encounter;
import com.ty.hospitalapp.dto.Hospital;
import com.ty.hospitalapp.services.BranchServices;

public class BranchServicesImp implements BranchServices {
	BranchDaoImp branchDaoImp = new BranchDaoImp();

	public Branch saveBranch(Branch branch, int hospital_id) {
		return branchDaoImp.saveBranch(branch, hospital_id);
	}

	public Branch getBranchById(int id) {
		return branchDaoImp.getBranchById(id);
	}

	public Hospital getBranchHospitalById(int id) {
		return branchDaoImp.getBranchHospitalById(id);
	}

	public List<Branch> getAllBranch() {
		return branchDaoImp.getAllBranch();
	}

	/*
	 * public List<Branch> getHospitalBranches(int hospital_id) { return
	 * branchDaoImp.getHospitalBranches(hospital_id); }
	 */

	public Address getBranchAddressById(int id) {
		return branchDaoImp.getBranchAddressById(id);
	}

	public List<Encounter> getBranchEncounters(int id) {
		return branchDaoImp.getBranchEncounters(id);
	}

	public Branch updateBranch(Branch branch, int id) {
		return branchDaoImp.updateBranch(branch, id);
	}

	public boolean deleteBranchById(int id) {
		return branchDaoImp.deleteBranchById(id);
	}

}
