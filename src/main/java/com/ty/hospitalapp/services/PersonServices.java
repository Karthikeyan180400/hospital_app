package com.ty.hospitalapp.services;

import java.util.List;

import com.ty.hospitalapp.dto.Encounter;
import com.ty.hospitalapp.dto.Person;

public interface PersonServices {
	Person savePerson(Person person);

	Person getPersonById(int id);

	List<Encounter> getPersonEncountersByPersonId(int id);

	List<Person> getAllPersons();

	Person updatePerson(Person person, int id);

	boolean deletePersonById(int id);

}
