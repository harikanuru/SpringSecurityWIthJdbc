package com.poc.demo.security.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.demo.security.dao.EmployeeDao;
import com.poc.demo.security.domain.Employee;
import com.poc.demo.security.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDao employeeDao;

	@Override
	public ArrayList<Employee> getEmployees() {
		return employeeDao.getEmployees();
	}

	@Override
	public boolean registeruser(Employee employee) {
		return employeeDao.registeruser(employee);
	}

	@Override
	public Employee deleteEmployee(Employee employee) {
		return employeeDao.deleteEmployee(employee);
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeDao.updateEmployee(employee);
	}

}
