package com.my.shop.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.my.shop.model.Category;
import com.my.shop.model.Item;

@Repository
public class ItemDaoImpl extends AbstractDao implements ItemDao {

	@Override
	public List<Item> getAllItems() {
		Session session = getSession(); 
		session.beginTransaction();
		List<Item> result = session.createCriteria(Item.class).list();
		session.getTransaction().commit();
		return result;
	}

}
