package com.ty.hospitalapp.controller.observation;

import com.ty.hospitalapp.dto.Observation;
import com.ty.hospitalapp.services.impl.ObservationServicesImp;

public class TestUpdateObservation {

	public static void main(String[] args) {
		ObservationServicesImp observationServicesImp = new ObservationServicesImp();
		Observation observation = new Observation();
		observation.setDiscription("need zyx medicine");
		Observation observation2 = observationServicesImp.updateObservation(observation, 2);
		if (observation2 != null) {
			System.out.println("Updated");
		} else {
			System.out.println("Not Updated");
		}

	}

}
