package com.poc.demo.security.dao;

import java.util.ArrayList;

import com.poc.demo.security.domain.Employee;

public interface EmployeeDao {
	
	ArrayList<Employee> getEmployees();

	boolean registeruser(Employee employee);

	Employee deleteEmployee(Employee employee);

	Employee updateEmployee(Employee employee);

}
