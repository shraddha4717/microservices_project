package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.servicei.EmployeeServiceI;

@RestController
public class EmployeeController
{
	@Autowired
	EmployeeServiceI es;
	
	@GetMapping("/getEmployee")
	public List<Employee> getAllEmployee() 
	{
		return es.getData();
		
	}

}
