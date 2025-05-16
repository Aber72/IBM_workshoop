package com.ibm.springmvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ibm.springmvc.entities.*;
@Repository
public interface EmployeeRepositories extends JpaRepository<Employee, Long> {

}
