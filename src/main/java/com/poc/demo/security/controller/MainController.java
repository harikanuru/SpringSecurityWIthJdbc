package com.poc.demo.security.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.poc.demo.security.domain.Employee;
import com.poc.demo.security.domain.ServiceStatus;
import com.poc.demo.security.service.EmployeeService;

@Controller
public class MainController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping("/")
	public String getLogin() {

		return "login";
	}

	@RequestMapping("/admin")
	public String adminpage() {

		return "adminpage";
	}

	@RequestMapping("/welcome")
	public String getHome() {

		return "welcome";
	}

	@RequestMapping("/dashboard")
	public String getDashboard() {

		return "dashboard";

	}

	@RequestMapping("/displayEmp")
	public String display() {

		return "display";
	}

	@RequestMapping("/registerform")
	public String getRegistrationForm() {

		return "registration";
	}
	
	@RequestMapping("/403")
	public String accessDeniedPage() {

		return "403";
	}

	/*
	 * Api to get registered employees list
	 */
	@RequestMapping("/getEmployees")
	public @ResponseBody ArrayList<Employee> getEmployees() {

		

	      Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	      String name = auth.getName(); //get logged in username
	      
	      System.out.println(name+" "+auth.getPrincipal()+" "+auth.getAuthorities());
	      
		return employeeService.getEmployees();
	}
 
	/*
	 * Api to registering an employee
	 */
	@RequestMapping(value = "/registerUser", produces = "application/json", consumes = "application/json", method = RequestMethod.POST)
	public @ResponseBody ServiceStatus registeruser(@RequestBody Employee employee) {

		ServiceStatus serviceStatus = new ServiceStatus();
		boolean status = false;
		String message = "";

		status = employeeService.registeruser(employee);

		serviceStatus.setServiceStatus(status);
		serviceStatus.setMessage(message);

		return serviceStatus;
	}
	
	@RequestMapping(value = "/updateEmp", produces = "application/json", consumes = "application/json", method = RequestMethod.POST)
	public @ResponseBody Employee updateEmployee(@RequestBody Employee employee) {

		return employeeService.updateEmployee(employee);

	}

	@RequestMapping(value = "/deleteEmp", method = RequestMethod.POST)
	public @ResponseBody Employee deleteEmployee(@RequestBody Employee employee) {

		return employeeService.deleteEmployee(employee);

	}

}
