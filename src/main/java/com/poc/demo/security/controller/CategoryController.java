package com.poc.demo.security.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.poc.demo.security.domain.Categories;

import com.poc.demo.security.service.CategoryService;

@RequestMapping("/category")
public class CategoryController {

	@Autowired
	CategoryService categoryService;

	/*
	 * Api to get registered employees list
	 */
	@RequestMapping(value = "/addCategirt", produces = "application/json", consumes = "application/json", method = RequestMethod.POST)
	public @ResponseBody int getEmployees(Categories categories) {

		return categoryService.addCategory(categories);
	}

}
