package com.my.shop.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.shop.model.Category;

@Repository
public class CategoryDaoImpl extends AbstractDao implements CategoryDao {

	@Override
	public List<Category> getAllCategories() {
		Session session = getSession(); 
		session.beginTransaction();
		List<Category> result = session.createCriteria(Category.class).list();
		session.getTransaction().commit();
		return result;
	}

}
