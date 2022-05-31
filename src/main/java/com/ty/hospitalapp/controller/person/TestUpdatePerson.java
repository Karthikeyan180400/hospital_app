package com.ty.hospitalapp.controller.person;

import com.ty.hospitalapp.dto.Person;
import com.ty.hospitalapp.services.impl.PersonServicesImp;

public class TestUpdatePerson {

	public static void main(String[] args) {
		PersonServicesImp personServicesImp = new PersonServicesImp();
		Person person = new Person();
		person.setAge(23);
		Person person2 = personServicesImp.updatePerson(person, 2);
		if (person2 != null) {
			System.out.println("Updated");
		} else {
			System.out.println("Not Updated");
		}

	}

}
