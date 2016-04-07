package com.my.shop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.my.shop.dao.CategoryDao;
import com.my.shop.dao.ItemDao;
import com.my.shop.model.Category;
import com.my.shop.model.Item;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	private ItemDao itemDao;

	@Override
	@Transactional
	public List<Item> getAllItems() {
		return itemDao.getAllItems();
	}

}
