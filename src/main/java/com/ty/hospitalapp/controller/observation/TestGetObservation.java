package com.ty.hospitalapp.controller.observation;

import com.ty.hospitalapp.dto.Encounter;
import com.ty.hospitalapp.dto.Observation;
import com.ty.hospitalapp.services.impl.ObservationServicesImp;

public class TestGetObservation {

	public static void main(String[] args) {
		ObservationServicesImp observationServicesImp = new ObservationServicesImp();
		Observation observation = observationServicesImp.getObservationById(1);
		if (observation != null) {
			System.out.println("");
			Encounter encounter = observation.getEncounter();
			System.out.println("Encounter Id: " + encounter.getId());
			System.out.println("Observation Id: " + observation.getId());
			System.out.println("Description: " + observation.getDiscription());
			System.out.println("Date_and_Time: " + observation.getDate_time());

		} else {
			System.out.println("No Observation taken");
		}

	}

}
