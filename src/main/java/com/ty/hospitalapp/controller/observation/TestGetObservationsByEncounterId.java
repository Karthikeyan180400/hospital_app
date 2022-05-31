package com.ty.hospitalapp.controller.observation;

import java.util.List;

import com.ty.hospitalapp.dto.Encounter;
import com.ty.hospitalapp.dto.Observation;
import com.ty.hospitalapp.services.impl.ObservationServicesImp;

public class TestGetObservationsByEncounterId {

	public static void main(String[] args) {
		ObservationServicesImp observationServicesImp = new ObservationServicesImp();
		List<Observation> observations = observationServicesImp.getObservationsByEncounterId(1);
		if (observations.size() > 0) {
			for (Observation observation : observations) {
				System.out.println("");
				Encounter encounter = observation.getEncounter();
				System.out.println("Encounter Id: " + encounter.getId());
				System.out.println("Observation Id: " + observation.getId());
				System.out.println("Description: " + observation.getDiscription());
				System.out.println("Date_and_Time: " + observation.getDate_time());
				System.out.println("_____________________________________________________");
			}
		} else {
			System.out.println("No Observatio Taken");
		}

	}

}
