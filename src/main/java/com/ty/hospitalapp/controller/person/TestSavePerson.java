package com.ty.hospitalapp.controller.person;

import com.ty.hospitalapp.dto.Person;
import com.ty.hospitalapp.services.impl.PersonServicesImp;

public class TestSavePerson {

	public static void main(String[] args) {
		PersonServicesImp personServicesImp = new PersonServicesImp();
		Person person = new Person();
		person.setName("xyz");
		person.setAge(22);
		person.setGender("Male");
		person.setPhone(1111111);
		person.setEmail("xyz@mail.com");
		
		Person person2 = personServicesImp.savePerson(person);
		if(person2 != null) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}

	}

}
