package com.poc.demo.security.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.poc.demo.security.domain.Employee;


@Service
public interface EmployeeService {

	ArrayList<Employee> getEmployees();

	boolean registeruser(Employee employee);

	Employee deleteEmployee(Employee employee);

	Employee updateEmployee(Employee employee);
}
