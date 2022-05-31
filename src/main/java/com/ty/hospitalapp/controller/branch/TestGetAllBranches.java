package com.ty.hospitalapp.controller.branch;

import java.util.List;

import com.ty.hospitalapp.dto.Branch;
import com.ty.hospitalapp.dto.Hospital;
import com.ty.hospitalapp.services.impl.BranchServicesImp;

public class TestGetAllBranches {

	public static void main(String[] args) {
		BranchServicesImp branchServicesImp = new BranchServicesImp();
		List<Branch> branches = branchServicesImp.getAllBranch();
		if (branches.size() > 0) {
			for (Branch branch : branches) {
				System.out.println("");
				System.out.println("Branch Id: " + branch.getId());
				System.out.println("Branch Name: " + branch.getName());
				System.out.println("Phone Num: " + branch.getPhone());
				System.out.println("Email: " + branch.getEmail());
				Hospital hospital = branch.getHospital();
				System.out.println("Hospital Name: " + hospital.getName());
				System.out.println("_____________________________________________");
			}

		} else {
			System.out.println("No Branches Exists");
		}

	}

}
