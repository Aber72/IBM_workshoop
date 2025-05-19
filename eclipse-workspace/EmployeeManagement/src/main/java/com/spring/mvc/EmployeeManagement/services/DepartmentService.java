package com.spring.mvc.EmployeeManagement.services;

import java.util.List;

import com.spring.mvc.EmployeeManagement.entities.Department;

public interface DepartmentService  {
	
	List<Department> getAllDepartments();
	Department getDepartmentById(Long id);
	Department saveDepartment(Department department);
	void deleteDepartment(Long id);
	Department updateDepartment(Long id,Department department);

}
