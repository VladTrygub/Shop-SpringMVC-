package com.my.shop.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.shop.model.User;
import com.my.shop.service.UserService;

public class TestUserService {
	
	private ApplicationContext context;
	private UserService userService;
	
	@Before
	public void init() {
		ApplicationContext context = new ClassPathXmlApplicationContext("rootContext.xml");
		userService = (UserService) context.getBean("userService");
	}

	@Test
	@Ignore
	public void testGetAllUsers() {
		List<User> Users = userService.getAllUsers();
		for (User User : Users) {
			System.out.println(User.getId());
		}
		assertFalse(Users.isEmpty());
		assertNotNull(Users);
	}
	
	@Test
	@Ignore
	public void testFindUserByID() {
		User user = userService.findUserByID(1);
		assertEquals("log1", user.getLogin());
	}
	
	@Test
//	@Ignore
	public void testFindUserByLogin() {
		User user = userService.findUserByLogin("log3");
		assertEquals("log3", user.getLogin());
		assertEquals("ROLE_ADMIN", user.getRole());
	}
	
	@Test
	@Ignore
	public void testCreateUser() {
		User c = new User();
		c.setLogin("testLog");
		c.setPassword("testPass");
		userService.createUser(c);
		System.out.println(c.getId());
		assertNotSame(0, c.getId());
	}

}
