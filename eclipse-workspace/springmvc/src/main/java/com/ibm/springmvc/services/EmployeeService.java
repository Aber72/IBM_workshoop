package com.ibm.springmvc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.springmvc.entities.Employee;
import com.ibm.springmvc.repositories.EmployeeRepositories;
@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepositories employeeRepositories;
	
	public Employee saveEmployee(Employee employee) {
		return employeeRepositories.save(employee);
	}
	
	public List<Employee> getAllEmployee(){
		
		return employeeRepositories.findAll();
		
		
		
	}
	

}
