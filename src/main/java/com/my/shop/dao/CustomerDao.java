package com.my.shop.dao;

import java.util.List;

import com.my.shop.model.Customer;

public interface CustomerDao {
	
	List<Customer> getAllCustomers();
	Customer getCustomerByID(long id);
	Customer createCustomer(Customer customer);
	Customer updateCustomer(long id, Customer customer);
	Customer deleteCustomer(long id);
	
}
