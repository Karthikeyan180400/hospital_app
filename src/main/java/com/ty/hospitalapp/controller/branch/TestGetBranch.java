package com.ty.hospitalapp.controller.branch;

import com.ty.hospitalapp.dto.Branch;
import com.ty.hospitalapp.dto.Hospital;
import com.ty.hospitalapp.services.impl.BranchServicesImp;

public class TestGetBranch {

	public static void main(String[] args) {
		BranchServicesImp branchServicesImp = new BranchServicesImp();
		Branch branch = branchServicesImp.getBranchById(1);
		if (branch != null) {
			System.out.println("");
			System.out.println("Branch Id: " + branch.getId());
			System.out.println("Branch Name: " + branch.getName());
			System.out.println("Phone Num: " + branch.getPhone());
			System.out.println("Email: " + branch.getEmail());
			Hospital hospital = branch.getHospital();
			// System.out.println("--------------------------------------");
			//System.out.println("Hospital Id: " + hospital.getId());
			System.out.println("Hospital Name: " + hospital.getName());
			// System.out.println("GST Num: " + hospital.getGstNumber());
		} else {
			System.out.println("No Branch Exists for Given ID");
		}

	}

}
