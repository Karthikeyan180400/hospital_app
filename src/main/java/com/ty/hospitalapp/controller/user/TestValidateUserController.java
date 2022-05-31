package com.ty.hospitalapp.controller.user;

import java.util.List;

import com.ty.hospitalapp.dto.User;
import com.ty.hospitalapp.services.impl.UserServicesImp;

public class TestValidateUserController {

	public static void main(String[] args) {
		UserServicesImp userServicesImp = new UserServicesImp();

		List<User> user = userServicesImp.validateUser("arju@mail.com", "arjun@123");
		if (user.size() > 0) {
			System.out.println("Valid User");

		} else {
			System.out.println("Email or Password is incorrect");
		}

	}

}
