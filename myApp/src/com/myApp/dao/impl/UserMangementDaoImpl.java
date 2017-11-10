package com.myApp.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.myApp.dao.UserMangementDao;
import com.myApp.domain.User;

@Repository

public class UserMangementDaoImpl implements UserMangementDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public Long createUser(User user) {
		em.persist(user);
		return null;
	}

}
