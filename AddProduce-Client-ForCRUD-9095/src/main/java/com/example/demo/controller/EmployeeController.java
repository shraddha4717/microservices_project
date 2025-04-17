package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.servicei.EmployeeServiceI;

@RestController
public class EmployeeController 
{
	@Autowired
	EmployeeServiceI es;
	
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee e) 
	{
		Employee emp = es.addEmployee(e);
		return emp;
		
	}

	public void m1()
	{
		System.out.println("This is me")
	}

}
