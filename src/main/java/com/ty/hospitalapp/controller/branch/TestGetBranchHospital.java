package com.ty.hospitalapp.controller.branch;

import com.ty.hospitalapp.dto.Hospital;
import com.ty.hospitalapp.services.impl.BranchServicesImp;

public class TestGetBranchHospital {

	public static void main(String[] args) {
		BranchServicesImp branchServicesImp = new BranchServicesImp();
		Hospital hospital = branchServicesImp.getBranchHospitalById(2);
		if (hospital != null) {
			System.out.println("Hospital Id: " + hospital.getId());
			System.out.println("Hospital Name: " + hospital.getName());
			System.out.println("GST Num: " + hospital.getGstNumber());
		}

	}

}
