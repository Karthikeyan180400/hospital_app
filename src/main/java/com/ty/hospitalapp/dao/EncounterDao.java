package com.ty.hospitalapp.dao;

import java.util.List;

import com.ty.hospitalapp.dto.Encounter;

public interface EncounterDao {
	Encounter createEncounter(int branch_id, int person_id, Encounter encounter);

	Encounter getEncounterById(int id);

	List<Encounter> getENEncountersByBranchId(int branch_id);

	List<Encounter> getEncountersByPersonId(int person_id);

	Encounter updateEncounter(Encounter encounter, int id);

	boolean deleteEncounter(int id);

}
