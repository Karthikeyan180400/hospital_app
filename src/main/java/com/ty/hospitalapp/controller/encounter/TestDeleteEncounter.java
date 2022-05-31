package com.ty.hospitalapp.controller.encounter;

import com.ty.hospitalapp.services.impl.EncounterServicesImp;

public class TestDeleteEncounter {

	public static void main(String[] args) {
		EncounterServicesImp encounterServicesImp = new EncounterServicesImp();
		boolean res = encounterServicesImp.deleteEncounter(2);
		if (res == true) {
			System.out.println("Deleted");
		} else {
			System.out.println("Not Deleted");
		}

	}

}
