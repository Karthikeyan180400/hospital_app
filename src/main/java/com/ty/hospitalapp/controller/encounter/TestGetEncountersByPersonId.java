package com.ty.hospitalapp.controller.encounter;

import java.util.List;

import com.ty.hospitalapp.dto.Branch;
import com.ty.hospitalapp.dto.Encounter;
import com.ty.hospitalapp.dto.Person;
import com.ty.hospitalapp.services.impl.EncounterServicesImp;

public class TestGetEncountersByPersonId {

	public static void main(String[] args) {
		EncounterServicesImp encounterServicesImp = new EncounterServicesImp();
		List<Encounter> encounters = encounterServicesImp.getEncountersByPersonId(1);
		if (encounters.size() > 0) {
			for (Encounter encounter : encounters) {
				System.out.println("");
				Person person = encounter.getPerson();
				System.out.println("Person Id: " + person.getId());
				System.out.println("Person Name: " + person.getName());
				System.out.println("Admit_date_time: " + encounter.getAdmit_date_time());
				System.out.println("Reason: " + encounter.getReason());
				System.out.println("Status: " + encounter.getStatus());
				Branch branch = encounter.getBranch();
				System.out.println("Branch Id: " + branch.getId());
				System.out.println("Branch Name: " + branch.getName());
				System.out.println("Discharge_date_time: " + encounter.getDischarge_date_time());
				System.out.println("---------------------------------------------------------------");

			}
		} else {
			System.out.println("No Encounters is Exists");
		}

	}

}
