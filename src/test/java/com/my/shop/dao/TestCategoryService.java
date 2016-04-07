package com.my.shop.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.my.shop.model.Category;
import com.my.shop.service.CategoryService;
import com.my.shop.service.CategoryServiceImpl;

public class TestCategoryService {

	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("rootContext.xml");
		CategoryService categoryService = (CategoryService) context.getBean("categoryService");
		List<Category> categories = categoryService.getAllCategories();
		for (Category category : categories) {
			System.out.println(category.getName());
		}
		assertFalse(categories.isEmpty());
	}

}
