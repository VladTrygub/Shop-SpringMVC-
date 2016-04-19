package com.my.shop.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.Projections;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.my.shop.model.User;

@Repository
public class UserDaoImpl extends AbstractDao implements UserDao {

	@Override
	public List<User> getAllUsers() {
		Session session = getSession();
		session.beginTransaction();
		
		List<User> users = session.createCriteria(User.class).list();
		
		session.getTransaction().commit();
		return users;
	}

	@Override
	public User findUserByID(long id) {
		Session session = getSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from User u where u.id = ?");
		query.setLong(0, id);
		User user = (User) query.uniqueResult();
		
		session.getTransaction().commit();
		return user;
	}

	@Override
	public User findUserByLogin(String login) {
		Session session = getSession();
		session.beginTransaction();
		
		Query query = session.createQuery("from User u where u.login = ?");
		query.setString(0, login);
		User user = (User) query.uniqueResult();
		
		session.getTransaction().commit();
		return null;
	}

	@Override
	public User createUser(User user) {
		Session session = getSession();
		session.beginTransaction();
		
		session.save(user);
		
		session.getTransaction().commit();
		return user;
	}

	@Override
	public User updateUser(long id, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User deleteUser(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
