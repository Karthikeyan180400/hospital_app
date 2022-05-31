package com.ty.hospitalapp.controller.user;

import com.ty.hospitalapp.services.impl.UserServicesImp;

public class TestDeleteUserController {

	public static void main(String[] args) {
		UserServicesImp userServicesImp = new UserServicesImp();
		boolean res = userServicesImp.deletedUserById(4);
		if (res == true) {
			System.out.println("Deleted");
		} else {
			System.out.println("Not Deleted");
		}

	}

}
