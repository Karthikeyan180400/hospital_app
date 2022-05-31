package com.ty.hospitalapp.controller.encounter;

import java.time.LocalDateTime;

import com.ty.hospitalapp.dto.Encounter;
import com.ty.hospitalapp.services.impl.EncounterServicesImp;

public class TestCreateEncounter {

	public static void main(String[] args) {
		EncounterServicesImp encounterServicesImp = new EncounterServicesImp();
		Encounter encounter = new Encounter();
		encounter.setAdmit_date_time(LocalDateTime.now());
		encounter.setReason("Cold");
		encounter.setStatus("On Observation");
		Encounter encounter2 = encounterServicesImp.createEncounter(1, 1, encounter);
		if(encounter2 != null) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}

	}

}
