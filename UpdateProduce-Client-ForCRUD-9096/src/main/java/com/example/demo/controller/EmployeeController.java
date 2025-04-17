package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.servicei.EmployeeServiceI;

@RestController
public class EmployeeController
{

	@Autowired
	EmployeeServiceI es;
	
	
	@PutMapping("/updateEmployee/{id}") 
	public void updateData(@RequestBody Employee e,@PathVariable int id) 
	{
		es.updateEmployee(e,id);
		System.out.println("data updated---");
	}
}
