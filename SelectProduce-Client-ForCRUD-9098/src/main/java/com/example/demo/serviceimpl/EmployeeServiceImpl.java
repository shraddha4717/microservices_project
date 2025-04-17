package com.example.demo.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.servicei.EmployeeServiceI;

@Service
public class EmployeeServiceImpl implements EmployeeServiceI{
	@Autowired
	EmployeeRepository er;
	

	@Override
	public List<Employee> getData() {
		// TODO Auto-generated method stub
		return (List<Employee>) er.findAll();
	}

}
