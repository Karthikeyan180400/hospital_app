package com.ty.hospitalapp.controller.medorder;

import com.ty.hospitalapp.services.impl.MedOrderServicesImp;

public class TestDeleteMedOrder {

	public static void main(String[] args) {
		MedOrderServicesImp medOrderServicesImp = new MedOrderServicesImp();
		boolean res = medOrderServicesImp.deleteMedOrderById(2);
		if (res == true) {
			System.out.println("Deleted");
		} else {
			System.out.println("Not MedOrder Exists to delete");
		}

	}

}
