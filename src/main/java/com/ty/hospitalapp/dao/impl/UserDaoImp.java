package com.ty.hospitalapp.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospitalapp.dao.UserDao;
import com.ty.hospitalapp.dto.User;

public class UserDaoImp implements UserDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public User saveUser(User user) {
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
	}

	public List<User> validateUser(String email, String password) {
		String sql = "select u from User u where u.email=?1 and u.password=?2";
		Query query = entityManager.createQuery(sql);
		query.setParameter(1, email);
		query.setParameter(2, password);
		return query.getResultList();
	}

	public List<User> getAllUser() {
		String sql = "select u from User u";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}

	public User getUserById(int id) {
		User user = entityManager.find(User.class, id);
		return user;
	}

	public User updateUser(User user, int id) {
		User user2 = entityManager.find(User.class, id);
		user2.setEmail(user.getEmail());
		user2.setPhone(user.getPhone());
		entityTransaction.begin();
		entityManager.merge(user2);
		entityTransaction.commit();
		return user2;
	}

	public boolean deletedUserById(int id) {
		User user = entityManager.find(User.class, id);
		if (user != null) {
			entityTransaction.begin();
			entityManager.remove(user);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

}
