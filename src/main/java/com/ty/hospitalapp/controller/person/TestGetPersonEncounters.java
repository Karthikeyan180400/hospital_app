package com.ty.hospitalapp.controller.person;

import java.util.List;

import com.ty.hospitalapp.dto.Branch;
import com.ty.hospitalapp.dto.Encounter;
import com.ty.hospitalapp.services.impl.PersonServicesImp;

public class TestGetPersonEncounters {

	public static void main(String[] args) {
		PersonServicesImp personServicesImp = new PersonServicesImp();
		List<Encounter> encounters = personServicesImp.getPersonEncountersByPersonId(1);
		if (encounters.size() > 0) {
			for (Encounter encounter : encounters) {
				System.out.println("");
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
