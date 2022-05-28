package com.ty.hospitalapp.dao;

import java.util.List;

import com.ty.hospitalapp.dto.Hospital;

public interface HospitalDao {
	Hospital saveHospital(Hospital hospital);

	Hospital getHospitalById(int id);

	Hospital getHospitalBranchesById(int id);

	List<Hospital> getAllHospitals();

	Hospital updateHospital(Hospital hospital, int id);

	boolean deleteHospitalById(int id);

}
