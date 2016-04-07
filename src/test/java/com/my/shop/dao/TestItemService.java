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

public class TestItemService {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("rootContext.xml");
		
		List<Item> categories = categoryService.getAllCategories();
		for (Category category : categories) {
			System.out.println(category.getName());
		}
		assertEquals(3, categories.size());
	}

}
