package com.ty.hospitalapp.dao;

import java.util.List;

import com.ty.hospitalapp.dto.MedOrder;

public interface MedOrderDao {
	MedOrder saveMedOrder(MedOrder medOrder, int encounter_id);

	MedOrder getMedOrderById(int id);

	List<MedOrder> getMedOrdersByEncounterId(int encounter_id);

	List<MedOrder> getMedOrdersByPersonId(int person_id);

	MedOrder updateMedOrder(MedOrder medOrder, int id);

	boolean deleteMedOrderById(int id);

}
