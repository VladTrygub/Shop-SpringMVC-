package com.my.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.my.shop.dao.UserDao;
import com.my.shop.model.User;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	@Override
	@Transactional
	public List<User> getAllUsers() {
		return userDao.getAllUsers();
	}

	@Override
	@Transactional
	public User findUserByID(long id) {
		return userDao.findUserByID(id);
	}

	@Override
	public User findUserByLogin(String login) {
		return userDao.findUserByLogin(login);
	}

	@Override
	public User createUser(User user) {
		return userDao.createUser(user);
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
