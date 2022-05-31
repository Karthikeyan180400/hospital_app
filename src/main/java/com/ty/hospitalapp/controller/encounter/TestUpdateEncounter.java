package com.ty.hospitalapp.controller.encounter;

import com.ty.hospitalapp.dto.Encounter;
import com.ty.hospitalapp.services.impl.EncounterServicesImp;

public class TestUpdateEncounter {

	public static void main(String[] args) {
		EncounterServicesImp encounterServicesImp = new EncounterServicesImp();
		Encounter encounter = new Encounter();
		encounter.setReason("Some Issue");
		Encounter encounter2 = encounterServicesImp.updateEncounter(encounter, 1);
		if (encounter2 != null) {
			System.out.println("Updated");
		} else {
			System.out.println("Not Updated");
		}

	}

}
