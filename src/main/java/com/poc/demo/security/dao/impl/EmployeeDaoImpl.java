package com.poc.demo.security.dao.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.poc.demo.security.dao.EmployeeDao;
import com.poc.demo.security.domain.Employee;
import com.poc.demo.security.repository.EmployeeRepository;

@Configuration
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public ArrayList<Employee> getEmployees() {
		return (ArrayList<Employee>) employeeRepository.findAll();
	}

	@Override
	public boolean registeruser(Employee employee) {
		boolean serviceStatus = false;

		try {
			employeeRepository.save(employee);
			serviceStatus = true;

		} catch (Exception e) {
			serviceStatus = false;
		}
		return serviceStatus;
	}

	@Override
	public Employee deleteEmployee(Employee employee) {

		
		Employee emp = employeeRepository.findOne(employee.getEmpId());
		
		employeeRepository.delete(emp);

		return emp;
	}

	@Override
	public Employee updateEmployee(Employee employee) {

		return employeeRepository.save(employee);
	}

}
