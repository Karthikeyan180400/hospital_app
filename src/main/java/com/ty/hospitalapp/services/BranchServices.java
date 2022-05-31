package com.ty.hospitalapp.services;

import java.util.List;

import com.ty.hospitalapp.dto.Address;
import com.ty.hospitalapp.dto.Branch;
import com.ty.hospitalapp.dto.Encounter;
import com.ty.hospitalapp.dto.Hospital;

public interface BranchServices {
	Branch saveBranch(Branch branch, int hospital_id);

	Branch getBranchById(int id);

	Hospital getBranchHospitalById(int id);

	List<Branch> getAllBranch();

	// List<Branch> getHospitalBranches(int hospital_id);

	Address getBranchAddressById(int id);

	List<Encounter> getBranchEncounters(int id);

	Branch updateBranch(Branch branch, int id);

	boolean deleteBranchById(int id);

}
