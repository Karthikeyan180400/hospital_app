package com.ty.hospitalapp.controller.hospital;

import java.util.List;

import com.ty.hospitalapp.dto.Branch;
import com.ty.hospitalapp.dto.Hospital;
import com.ty.hospitalapp.services.impl.HospitalServicesImp;

public class TestGetHospitalBranches {

	public static void main(String[] args) {
		HospitalServicesImp hospitalServicesImp = new HospitalServicesImp();
		List<Branch> branches = hospitalServicesImp.getHospitalBranchesById(4);
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
			System.out.println("No Branch is exists for given hospital ID");
		}

	}

}
