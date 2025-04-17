package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.servicei.EmployeeServiceI;

@RestController
public class EmployeeController 
{
	@Autowired
	EmployeeServiceI es;
	
	@DeleteMapping("deleteEmployee/{id}")
	public void deleteData(@PathVariable int id) 
	{
		es.deleteData(id);
	}

}
