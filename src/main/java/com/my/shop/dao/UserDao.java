package com.my.shop.dao;

import java.util.List;

import com.my.shop.model.User;

public interface UserDao {
	
	List<User> getAllUsers();
	User findUserByID(long id);
	User findUserByLogin(String login);
	User createUser(User user);
	User updateUser(long id, User user);
	User deleteUser(long id);
	
}
