package com.ty.hospitalapp.controller.hospital;

import com.ty.hospitalapp.dto.Hospital;
import com.ty.hospitalapp.services.impl.HospitalServicesImp;

public class TestGetHospital {

	public static void main(String[] args) {
		HospitalServicesImp hospitalServicesImp = new HospitalServicesImp();
		Hospital hospital = hospitalServicesImp.getHospitalById(1);
		if (hospital != null) {
			System.out.println("ID: " + hospital.getId());
			System.out.println("Name: " + hospital.getName());
			System.out.println("GST Num: " + hospital.getGstNumber());
		} else {
			System.out.println("Hospital is not exists");
		}

	}

}
