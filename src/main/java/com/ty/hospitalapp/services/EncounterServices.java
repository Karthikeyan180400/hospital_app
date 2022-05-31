package com.ty.hospitalapp.services;

import java.util.List;

import com.ty.hospitalapp.dto.Encounter;

public interface EncounterServices {
	Encounter createEncounter(int branch_id, int person_id, Encounter encounter);

	Encounter getEncounterById(int id);

	List<Encounter> getEncountersByBranchId(int branch_id);

	List<Encounter> getEncountersByPersonId(int person_id);

	Encounter updateEncounter(Encounter encounter, int id);

	boolean deleteEncounter(int id);

}
