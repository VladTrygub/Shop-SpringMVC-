package com.my.shop.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.shop.model.Category;
import com.my.shop.model.Item;
import com.my.shop.service.CategoryService;
import com.my.shop.service.CategoryServiceImpl;
import com.my.shop.service.ItemService;

public class TestItemService {

	@Test
	public void testGetAllItems() {
		ApplicationContext context = new ClassPathXmlApplicationContext("rootContext.xml");
		ItemService itemService = (ItemService) context.getBean("itemService"); 
		List<Item> items = itemService.getAllItems();
		assertFalse(items.isEmpty());
		assertNotNull(items);
	}

}
