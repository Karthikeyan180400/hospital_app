package com.ty.hospitalapp.services.impl;

import java.util.List;

import com.ty.hospitalapp.dao.impl.EncounterDaoImp;
import com.ty.hospitalapp.dto.Encounter;
import com.ty.hospitalapp.services.EncounterServices;

public class EncounterServicesImp implements EncounterServices {
	EncounterDaoImp encounterDaoImp = new EncounterDaoImp();

	public Encounter createEncounter(int branch_id, int person_id, Encounter encounter) {
		return encounterDaoImp.createEncounter(branch_id, person_id, encounter);
	}

	public Encounter getEncounterById(int id) {
		return encounterDaoImp.getEncounterById(id);
	}

	public List<Encounter> getEncountersByBranchId(int branch_id) {
		return encounterDaoImp.getEncountersByBranchId(branch_id);
	}

	public List<Encounter> getEncountersByPersonId(int person_id) {
		return encounterDaoImp.getEncountersByPersonId(person_id);
	}

	public Encounter updateEncounter(Encounter encounter, int id) {
		return encounterDaoImp.updateEncounter(encounter, id);
	}

	public boolean deleteEncounter(int id) {
		return encounterDaoImp.deleteEncounter(id);
	}

}
