package com.ty.hospitalapp.controller.observation;

import com.ty.hospitalapp.services.impl.ObservationServicesImp;

public class TestDeleteObservation {

	public static void main(String[] args) {
		ObservationServicesImp observationServicesImp = new ObservationServicesImp();
		boolean res = observationServicesImp.deleteObservationById(2);
		if (res == true) {
			System.out.println("Deleted");
		} else {
			System.out.println("Not Deleted");
		}

	}

}
