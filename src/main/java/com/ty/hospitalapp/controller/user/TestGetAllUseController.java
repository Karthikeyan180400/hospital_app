package com.ty.hospitalapp.controller.user;

import java.util.List;

import com.ty.hospitalapp.dto.User;
import com.ty.hospitalapp.services.impl.UserServicesImp;

public class TestGetAllUseController {

	public static void main(String[] args) {
		UserServicesImp userServicesImp = new UserServicesImp();
		List<User> users = userServicesImp.getAllUser();
		if (users.size() > 0) {
			for (User user : users) {
				System.out.println("Name: " + user.getName());
				System.out.println("Email: " + user.getEmail());
				System.out.println("Phone: " + user.getPhone());
				System.out.println("Role: " + user.getRole());
				System.out.println("----------------------------------");
			}
		} else {
			System.out.println("No Users Exists");
		}

	}

}
