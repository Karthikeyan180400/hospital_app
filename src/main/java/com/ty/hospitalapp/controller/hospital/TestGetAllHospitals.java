package com.ty.hospitalapp.controller.hospital;

import java.util.List;

import com.ty.hospitalapp.dto.Hospital;
import com.ty.hospitalapp.services.impl.HospitalServicesImp;

public class TestGetAllHospitals {

	public static void main(String[] args) {
		HospitalServicesImp hospitalServicesImp = new HospitalServicesImp();
		List<Hospital> hospitals = hospitalServicesImp.getAllHospitals();
		if (hospitals.size() > 0) {
			System.out.println("");
			for (Hospital hospital : hospitals) {
				System.out.println("ID: " + hospital.getId());
				System.out.println("Name: " + hospital.getName());
				System.out.println("GST Num: " + hospital.getGstNumber());
				System.out.println("--------------------------------------------");

			}

		}

	}

}
