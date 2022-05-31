package com.ty.hospitalapp.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospitalapp.dao.PersonDao;
import com.ty.hospitalapp.dto.Encounter;
import com.ty.hospitalapp.dto.Person;

public class PersonDaoImp implements PersonDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	public Person savePerson(Person person) {
		entityTransaction.begin();
		entityManager.persist(person);
		entityTransaction.commit();
		return person;
	}

	public Person getPersonById(int id) {
		Person person = entityManager.find(Person.class, id);
		return person;
	}

	public List<Encounter> getPersonEncountersByPersonId(int id) {
		Person person = entityManager.find(Person.class, id);
		return person.getEncounters();
	}

	public List<Person> getAllPersons() {
		String sql = "select p from Person p";
		Query query = entityManager.createQuery(sql);
		return query.getResultList();
	}

	public Person updatePerson(Person person, int id) {
		Person person2 = entityManager.find(Person.class, id);
		person2.setAge(person.getAge());
		entityTransaction.begin();
		entityManager.merge(person2);
		entityTransaction.commit();
		return person2;
	}

	public boolean deletePersonById(int id) {
		Person person = entityManager.find(Person.class, id);
		if (person != null) {
			entityTransaction.begin();
			entityManager.remove(person);
			entityTransaction.commit();
			return true;
		}
		return false;
	}

}
