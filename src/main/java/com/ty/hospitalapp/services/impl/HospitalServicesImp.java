package com.ty.hospitalapp.services.impl;

import java.util.List;

import com.ty.hospitalapp.dao.impl.HospitalDaoImp;
import com.ty.hospitalapp.dto.Branch;
import com.ty.hospitalapp.dto.Hospital;
import com.ty.hospitalapp.services.HospitalServices;

public class HospitalServicesImp implements HospitalServices {
	HospitalDaoImp hospitalDaoImp = new HospitalDaoImp();

	public Hospital saveHospital(Hospital hospital) {
		return hospitalDaoImp.saveHospital(hospital);
	}

	public Hospital getHospitalById(int id) {
		return hospitalDaoImp.getHospitalById(id);
	}

	public List<Branch> getHospitalBranchesById(int id) {
		return hospitalDaoImp.getHospitalBranchesById(id);
	}

	public List<Hospital> getAllHospitals() {
		return hospitalDaoImp.getAllHospitals();
	}

	public Hospital updateHospital(Hospital hospital, int id) {
		return hospitalDaoImp.updateHospital(hospital, id);
	}

	public boolean deleteHospitalById(int id) {
		return hospitalDaoImp.deleteHospitalById(id);
	}

}
