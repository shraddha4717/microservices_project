package com.example.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;
import com.example.demo.servicei.EmployeeServiceI;

@Service
public class EmployeeServiceImpl implements EmployeeServiceI
{
	@Autowired
	EmployeeRepository er;

	@Override
	public Employee addEmployee(Employee e) {
		// TODO Auto-generated method stub
		return er.save(e);
	}

}
