package com.poc.demo.security.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.poc.demo.security.dao.CategoryDao;
import com.poc.demo.security.domain.Categories;
import com.poc.demo.security.repository.CategoryReposiroty;
import com.poc.demo.security.repository.EmployeeRepository;

public class CategoryDaoImpl implements CategoryDao {

	@Autowired
	CategoryReposiroty categoryReposiroty;

	@Override
	public int addCategory(Categories categories) {
		categoryReposiroty.save(categories);

		return 0;
	}

}
