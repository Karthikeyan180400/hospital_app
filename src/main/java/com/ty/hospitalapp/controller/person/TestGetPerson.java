package com.ty.hospitalapp.controller.person;

import com.ty.hospitalapp.dto.Person;
import com.ty.hospitalapp.services.impl.PersonServicesImp;

public class TestGetPerson {

	public static void main(String[] args) {
		PersonServicesImp personServicesImp = new PersonServicesImp();
		Person person = personServicesImp.getPersonById(1);
		if (person != null) {
			System.out.println("");
			System.out.println("Name: " + person.getName());
			System.out.println("Email: " + person.getEmail());
			System.out.println("Phone: " + person.getPhone());
			System.out.println("Age: " + person.getAge());
			System.out.println("Gender: " + person.getGender());
		} else {
			System.out.println("No Person Exists");
		}

	}

}
