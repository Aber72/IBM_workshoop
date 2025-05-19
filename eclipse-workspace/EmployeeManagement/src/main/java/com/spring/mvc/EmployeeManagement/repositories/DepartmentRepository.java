package com.spring.mvc.EmployeeManagement.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.mvc.EmployeeManagement.entities.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long>{
	
	Department findByName(String name);

}
