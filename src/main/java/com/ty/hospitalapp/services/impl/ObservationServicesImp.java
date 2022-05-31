package com.ty.hospitalapp.services.impl;

import java.util.List;

import com.ty.hospitalapp.dao.impl.ObservationDaoImp;
import com.ty.hospitalapp.dto.Observation;
import com.ty.hospitalapp.services.ObservationServices;

public class ObservationServicesImp implements ObservationServices {
	ObservationDaoImp observationDaoImp = new ObservationDaoImp();

	public Observation createObservation(Observation observation, int encounter_id) {
		return observationDaoImp.createObservation(observation, encounter_id);
	}

	public Observation getObservationById(int id) {
		return observationDaoImp.getObservationById(id);
	}

	public List<Observation> getObservationsByEncounterId(int encounter_id) {
		return observationDaoImp.getObservationsByEncounterId(encounter_id);
	}

	public Observation updateObservation(Observation observation, int id) {
		return observationDaoImp.updateObservation(observation, id);
	}

	public boolean deleteObservationById(int id) {
		return observationDaoImp.deleteObservationById(id);
	}

}
