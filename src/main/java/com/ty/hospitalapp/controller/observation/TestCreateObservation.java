package com.ty.hospitalapp.controller.observation;

import java.time.LocalDateTime;

import com.ty.hospitalapp.dto.Observation;
import com.ty.hospitalapp.services.impl.ObservationServicesImp;

public class TestCreateObservation {

	public static void main(String[] args) {
		ObservationServicesImp observationServicesImp = new ObservationServicesImp();
		Observation observation = new Observation();
		observation.setDate_time(LocalDateTime.now());
		observation.setDiscription("Geeting normalized,need xyz medicine");

		Observation observation2 = observationServicesImp.createObservation(observation, 1);
		if (observation2 != null) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}

	}

}
