package com.spring.mvc.EmployeeManagement.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.spring.mvc.EmployeeManagement.entities.Department;
import com.spring.mvc.EmployeeManagement.repositories.DepartmentRepository;

@Service
@javax.transaction.Transactional
public class DepartmentServiceImpl implements DepartmentService {

	@Autowired
	 private DepartmentRepository departmentRepository;
	@Override
	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll() ;
	}

	@Override
	public Department getDepartmentById(Long id) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(id)
				.orElseThrow(()-> new RuntimeException("not have department"));
	}

	@Override
	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	@Override
	public void deleteDepartment(Long id) {
		// TODO Auto-generated method stub
		departmentRepository.deleteById(id);
		
	}

	@Override
	public Department updateDepartment(Long id, Department department) {
		// TODO Auto-generated method stub
		
		Department existingDepartment = getDepartmentById(id);
		
		if (department.getName() != null && !department.getName().trim().isEmpty()) {
		    existingDepartment.setName(department.getName());
		}

		 return departmentRepository.save(existingDepartment);
	}
	
	

}
