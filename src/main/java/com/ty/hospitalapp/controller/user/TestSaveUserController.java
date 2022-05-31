package com.ty.hospitalapp.controller.user;

import com.ty.hospitalapp.dto.User;
import com.ty.hospitalapp.services.impl.UserServicesImp;

public class TestSaveUserController {

	public static void main(String[] args) {
		UserServicesImp userServicesImp = new UserServicesImp();
		User user = new User();
		user.setName("Raju");
		user.setEmail("raju@mail.com");
		user.setPassword("raju@123");
		user.setPhone(3333333333l);
		user.setRole("Nurse");

		User user2 = userServicesImp.saveUser(user);
		if (user2 != null) {
			System.out.println("Inserted");
		} else {
			System.out.println("Not Inserted");
		}

	}

}
