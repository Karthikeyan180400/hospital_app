package com.ty.hospitalapp.services;

import java.util.List;

import com.ty.hospitalapp.dto.User;

public interface UserServices {
	User saveUser(User user);

	List<User> validateUser(String email, String password);

	List<User> getAllUser();

	User getUserById(int id);

	User updateUser(User user, int id);

	boolean deletedUserById(int id);

}
