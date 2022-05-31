package com.ty.hospitalapp.controller.user;

import com.ty.hospitalapp.dto.User;
import com.ty.hospitalapp.services.impl.UserServicesImp;

public class TestGetUserByIdController {

	public static void main(String[] args) {
		UserServicesImp userServicesImp = new UserServicesImp();
		User user = userServicesImp.getUserById(3);
		if (user != null) {
			System.out.println("Name: " + user.getName());
			System.out.println("Email: " + user.getEmail());
			System.out.println("Phone: " + user.getPhone());
			System.out.println("Role: " + user.getRole());
		}

	}

}
