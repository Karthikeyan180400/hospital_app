package com.ty.hospitalapp.controller.hospital;

import com.ty.hospitalapp.services.impl.HospitalServicesImp;

public class TestDeleteHospital {

	public static void main(String[] args) {
		HospitalServicesImp hospitalServicesImp = new HospitalServicesImp();
		boolean res = hospitalServicesImp.deleteHospitalById(3);
		if (res == true) {
			System.out.println("Deleted");
		} else {
			System.out.println("Not Deleted");
		}

	}

}
