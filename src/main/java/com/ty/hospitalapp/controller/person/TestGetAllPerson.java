package com.ty.hospitalapp.controller.person;

import java.util.List;

import com.ty.hospitalapp.dto.Person;
import com.ty.hospitalapp.services.impl.PersonServicesImp;

public class TestGetAllPerson {

	public static void main(String[] args) {
		PersonServicesImp personServicesImp = new PersonServicesImp();
		List<Person> persons = personServicesImp.getAllPersons();
		if (persons.size() > 0) {
			for (Person person : persons) {
				System.out.println("");
				System.out.println("Name: " + person.getName());
				System.out.println("Email: " + person.getEmail());
				System.out.println("Phone: " + person.getPhone());
				System.out.println("Age: " + person.getAge());
				System.out.println("Gender: " + person.getGender());
				System.out.println("____________________________________________");
			}
		} else {
			System.out.println("No Persons exists");
		}

	}

}
