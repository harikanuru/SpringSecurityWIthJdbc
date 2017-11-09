package com.poc.demo.security.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.poc.demo.security.domain.Employee;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
