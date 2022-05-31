package com.ty.hospitalapp.services.impl;

import java.util.List;

import com.ty.hospitalapp.dao.impl.PersonDaoImp;
import com.ty.hospitalapp.dto.Encounter;
import com.ty.hospitalapp.dto.Person;
import com.ty.hospitalapp.services.PersonServices;

public class PersonServicesImp implements PersonServices {
	PersonDaoImp personDaoImp = new PersonDaoImp();

	public Person savePerson(Person person) {
		return personDaoImp.savePerson(person);
	}

	public Person getPersonById(int id) {
		return personDaoImp.getPersonById(id);
	}

	public List<Encounter> getPersonEncountersByPersonId(int id) {
		return personDaoImp.getPersonEncountersByPersonId(id);
	}

	public List<Person> getAllPersons() {
		return personDaoImp.getAllPersons();
	}

	public Person updatePerson(Person person, int id) {
		return personDaoImp.updatePerson(person, id);
	}

	public boolean deletePersonById(int id) {
		return personDaoImp.deletePersonById(id);
	}

}
