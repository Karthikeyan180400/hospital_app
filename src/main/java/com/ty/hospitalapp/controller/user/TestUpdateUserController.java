package com.ty.hospitalapp.controller.user;

import com.ty.hospitalapp.dto.User;
import com.ty.hospitalapp.services.impl.UserServicesImp;

public class TestUpdateUserController {

	public static void main(String[] args) {
		UserServicesImp userServicesImp = new UserServicesImp();
		User user = new User();
		user.setEmail("raani@mail.com");
		user.setPhone(2222222220l);
		User user2 = userServicesImp.updateUser(user, 2);
		if (user2 != null) {
			System.out.println("Updated");
		} else {
			System.out.println("Not Updated");
		}

	}

}
