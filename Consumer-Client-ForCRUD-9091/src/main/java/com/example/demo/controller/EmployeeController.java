package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.model.Employee;

@RestController
public class EmployeeController 
{
	@Autowired
	RestTemplate rt;
	
	@PostMapping("/addData")
	public Employee addData(@RequestBody Employee e) 
	{
		String url = "http://zuul/add/addEmployee";
		Employee emp = rt.postForObject(url, e, Employee.class);
		return emp;
		
	}
	
	@PutMapping("/updateData/{id}")
	public void updateData(@RequestBody Employee e,@PathVariable int id) 
	{
		String url = "http://zuul/update/updateEmployee/"+id;
		rt.put(url, e);
	}
	
	@DeleteMapping("/deleteData/{id}")
	public void deleteData(@PathVariable int id) 
	{
		String url = "http://zuul/delete/deleteEmployee/"+id;
		rt.delete(url);
	}
	
	@GetMapping("/getData")
	public List<Employee> getData() 
	{
		String url = "http://zuul/select/getEmployee/";
		List<Employee> al = rt.getForObject(url, List.class);
		return al;

	}

}
