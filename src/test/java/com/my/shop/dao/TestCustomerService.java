package com.my.shop.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.shop.model.Customer;
import com.my.shop.service.CustomerService;

public class TestCustomerService {
	
	

	@Test
	public void testGetAllCustomers() {
		ApplicationContext context = new ClassPathXmlApplicationContext("rootContext.xml");
		CustomerService customerService = (CustomerService) context.getBean("customerService");
		List<Customer> customers = customerService.getAllCustomers();
		
		assertFalse(customers.isEmpty());
		assertNotNull(customers);
	}
	
	@Test
	public void testGetCustomerByID() {
		
	}

}
