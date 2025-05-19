package com.spring.mvc.EmployeeManagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.mvc.EmployeeManagement.entities.Department;
import com.spring.mvc.EmployeeManagement.entities.Employee;

import com.spring.mvc.EmployeeManagement.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	 
	@Autowired
	private DepartmentService departmentService;
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> getAllEmployees() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(Long id) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(id).orElseThrow(
				()-> new RuntimeException("Employee not present"));
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		
		
		if(employee.getDepartment()!=null && employee.getDepartment().getId()!=null) {
			Department department = departmentService.getDepartmentById(employee.getDepartment().getId());
			employee.setDepartment(department);
		}
		return employeeRepository.save(employee);
		
		
		
	}

	@Override
	public void deleteemployee(Long id) {
		
		employeeRepository.deleteById(id);
		
		
		
	}

	@Override
	public Employee updateEmployee(Long id, Employee employee) {
		// TODO Auto-generated method stub

		Employee existingEmployee = getEmployeeById(id);
		existingEmployee.setName(employee.getName());
		
		if(employee.getDepartment()!=null && employee.getDepartment().getId()!=null) {
			Department department = departmentService.getDepartmentById(employee.getDepartment().getId());
			existingEmployee.setDepartment(department);
		}
		return employeeRepository.save(existingEmployee);
		
	}

	@Override
	public List<Employee> getEmployeeByDepartmentId(Long departmentId) {
		// TODO Auto-generated method stub
		return employeeRepository.findByDepartmentId(departmentId);
	}
	

}
