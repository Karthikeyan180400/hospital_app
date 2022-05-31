package com.ty.hospitalapp.services;

import java.util.List;

import com.ty.hospitalapp.dto.Branch;
import com.ty.hospitalapp.dto.Hospital;

public interface HospitalServices {
	Hospital saveHospital(Hospital hospital);

	Hospital getHospitalById(int id);

	List<Branch> getHospitalBranchesById(int id);

	List<Hospital> getAllHospitals();

	Hospital updateHospital(Hospital hospital, int id);

	boolean deleteHospitalById(int id);

}
