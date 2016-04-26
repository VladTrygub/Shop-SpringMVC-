package com.my.shop.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.my.shop.model.Category;
import com.my.shop.model.Item;
import com.my.shop.service.CategoryService;
import com.my.shop.service.ItemService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class CategoryController {
	
	private static final Logger logger = LoggerFactory.getLogger(CategoryController.class);
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value = "/category", method = RequestMethod.GET)
	public ModelAndView category() {
		List<Category> categories = categoryService.getAllCategories();
		return new ModelAndView("category", "categories", categories);
	}
}
