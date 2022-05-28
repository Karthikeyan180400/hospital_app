package com.ty.hospitalapp.dao;

import java.util.List;

import com.ty.hospitalapp.dto.Observation;

public interface ObservationDao {
	Observation createObservation(Observation observation, int encounter_id);

	Observation getObservationById(int id);

	List<Observation> getObservationsByEncounterId(int encounter_id);

	Observation updateObservation(Observation observation, int id);

	boolean deleteObservationById(int id);
}
