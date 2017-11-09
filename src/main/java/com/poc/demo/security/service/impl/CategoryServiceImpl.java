package com.poc.demo.security.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.poc.demo.security.dao.CategoryDao;
import com.poc.demo.security.domain.Categories;
import com.poc.demo.security.service.CategoryService;

public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryDao categoryDao;

	@Override
	public int addCategory(Categories categories) {
		
		return categoryDao.addCategory(categories);
	}

}
