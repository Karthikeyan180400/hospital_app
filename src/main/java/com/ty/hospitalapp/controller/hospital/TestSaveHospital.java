package com.ty.hospitalapp.controller.hospital;

import com.ty.hospitalapp.dto.Hospital;
import com.ty.hospitalapp.services.impl.HospitalServicesImp;

public class TestSaveHospital {

	public static void main(String[] args) {
		HospitalServicesImp hospitalServicesImp = new HospitalServicesImp();
		Hospital hospital = new Hospital();
		hospital.setName("Alvar Hospital");
		hospital.setGstNumber("GSTAH123");

		Hospital hospital2 = hospitalServicesImp.saveHospital(hospital);
		if (hospital2 != null) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}

	}

}
