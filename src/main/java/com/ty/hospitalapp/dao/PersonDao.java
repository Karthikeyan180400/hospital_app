package com.ty.hospitalapp.dao;

import java.util.List;

import com.ty.hospitalapp.dto.Encounter;
import com.ty.hospitalapp.dto.Person;

public interface PersonDao {
	Person savePerson(Person person);

	Person getPersonById(int id);

	List<Encounter> getPersonEncountersByPersonId(int id);

	List<Person> getAllPersons();

	Person updatePerson(Person person, int id);

	boolean deletePersonById(int id);

}
