package com.ty.hospitalapp.controller.medorder;

import com.ty.hospitalapp.dto.MedOrder;
import com.ty.hospitalapp.services.impl.MedOrderServicesImp;

public class TestSaveMedOrder {

	public static void main(String[] args) {
		MedOrderServicesImp medOrderServicesImp = new MedOrderServicesImp();
		MedOrder medOrder = new MedOrder();
		MedOrder medOrder2 = medOrderServicesImp.saveMedOrder(medOrder, 1);
		if (medOrder2 != null) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}

	}

}
