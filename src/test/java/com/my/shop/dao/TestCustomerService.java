package com.my.shop.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.shop.model.Customer;
import com.my.shop.service.CustomerService;

public class TestCustomerService {
	
	private ApplicationContext context;
	private CustomerService customerService;
	
	@Before
	public void init() {
		ApplicationContext context = new ClassPathXmlApplicationContext("rootContext.xml");
		customerService = (CustomerService) context.getBean("customerService");
	}

	@Test
	@Ignore
	public void testGetAllCustomers() {
		List<Customer> customers = customerService.getAllCustomers();
		for (Customer customer : customers) {
			System.out.println(customer.getId());
		}
		assertFalse(customers.isEmpty());
		assertNotNull(customers);
	}
	
	@Test
	@Ignore
	public void testGetCustomerByID() {
		Customer customer = customerService.getCustomerByID(1);
		assertEquals("log1", customer.getLogin());
	}
	
	@Test
	@Ignore
	public void testCreateCustomer() {
		Customer c = new Customer();
		c.setLogin("testLog");
		c.setPassword("testPass");
		customerService.createCustomer(c);
		System.out.println(c.getId());
		assertNotSame(0, c.getId());
	}

}
