package com.spring.mvc.EmployeeManagement.services;

import java.util.List;

import com.spring.mvc.EmployeeManagement.entities.Employee;

public interface EmployeeService {
	
	List<Employee> getAllEmployees();
	Employee getEmployeeById(Long id);
	Employee saveEmployee(Employee employee);
	void deleteemployee(Long id);
	Employee updateEmployee(Long id, Employee employee);
	List<Employee> getEmployeeByDepartmentId(Long departmentId);

}
