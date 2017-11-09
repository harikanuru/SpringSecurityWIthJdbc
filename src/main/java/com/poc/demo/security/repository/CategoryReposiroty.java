package com.poc.demo.security.repository;

import org.springframework.data.repository.CrudRepository;

import com.poc.demo.security.domain.Categories;

public interface CategoryReposiroty extends CrudRepository<Categories, Integer>{

}
