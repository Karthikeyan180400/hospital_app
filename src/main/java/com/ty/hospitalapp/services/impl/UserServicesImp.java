package com.ty.hospitalapp.services.impl;

import java.util.List;

import com.ty.hospitalapp.dao.impl.UserDaoImp;
import com.ty.hospitalapp.dto.User;
import com.ty.hospitalapp.services.UserServices;

public class UserServicesImp implements UserServices {
	UserDaoImp userDaoImp = new UserDaoImp();

	public User saveUser(User user) {
		return userDaoImp.saveUser(user);
	}

	public List<User> validateUser(String email, String password) {
		return userDaoImp.validateUser(email, password);
	}

	public List<User> getAllUser() {
		return userDaoImp.getAllUser();
	}

	public User getUserById(int id) {
		return userDaoImp.getUserById(id);
	}

	public User updateUser(User user, int id) {
		return userDaoImp.updateUser(user, id);
	}

	public boolean deletedUserById(int id) {
		return userDaoImp.deletedUserById(id);
	}

}
