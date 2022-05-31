package com.ty.hospitalapp.services.impl;

import java.util.List;

import com.ty.hospitalapp.dao.impl.MedOrderDaoImp;
import com.ty.hospitalapp.dto.MedOrder;
import com.ty.hospitalapp.services.MedOrderServices;

public class MedOrderServicesImp implements MedOrderServices {
	MedOrderDaoImp medOrderDaoImp = new MedOrderDaoImp();

	public MedOrder saveMedOrder(MedOrder medOrder, int encounter_id) {
		return medOrderDaoImp.saveMedOrder(medOrder, encounter_id);
	}

	public MedOrder getMedOrderById(int id) {
		return medOrderDaoImp.getMedOrderById(id);
	}

	public List<MedOrder> getMedOrdersByEncounterId(int encounter_id) {
		return medOrderDaoImp.getMedOrdersByEncounterId(encounter_id);
	}

	public List<MedOrder> getMedOrdersByPersonId(int person_id) {
		return medOrderDaoImp.getMedOrdersByPersonId(person_id);
	}

	public MedOrder updateMedOrder(MedOrder medOrder, int id) {
		return medOrderDaoImp.updateMedOrder(medOrder, id);

	}

	public boolean deleteMedOrderById(int id) {
		return medOrderDaoImp.deleteMedOrderById(id);
	}

}
