package com.my.shop.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.my.shop.model.Item;
import com.my.shop.service.ItemService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ItemController {
	
	private static final Logger logger = LoggerFactory.getLogger(ItemController.class);
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value = "/item", method = RequestMethod.GET)
	public ModelAndView item() {
		List<Item> items = itemService.getAllItems();
		return new ModelAndView("item", "items", items);
	}
	
}
