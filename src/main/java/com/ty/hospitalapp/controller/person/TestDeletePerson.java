package com.ty.hospitalapp.controller.person;

import com.ty.hospitalapp.services.impl.PersonServicesImp;

public class TestDeletePerson {

	public static void main(String[] args) {
		PersonServicesImp personServicesImp = new PersonServicesImp();
		boolean res = personServicesImp.deletePersonById(2);
		if (res == true) {
			System.out.println("Deleted");
		} else {
			System.out.println("Not Deleted");
		}

	}

}
