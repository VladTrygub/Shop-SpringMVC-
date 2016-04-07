package com.my.shop.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Expression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.shop.model.Customer;

@Repository
public class CustomerDaoImpl extends AbstractDao implements CustomerDao {

	@Override
	public List<Customer> getAllCustomers() {
		Session session = getSession();
		session.beginTransaction();
		List<Customer> customers = session.createCriteria(Customer.class).list();
		session.getTransaction().commit();
		return customers;
	}

	@Override
	public Customer getCustomerByID(long id) {
		Session session = getSession();
		Criteria criteria = session.createCriteria(Customer.class);
		criteria.add(Expression.gt("id", id));
		Customer customer = (Customer) criteria.uniqueResult();
		return customer;
	}

	@Override
	public Customer createCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer updateCustomer(long id, Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer deleteCustomer(long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
