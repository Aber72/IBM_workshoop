package com.spring.mvc.EmployeeManagement.entities;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="departments")
public class Department {
	
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	@Column(name="name", nullable = false)
	private String name;
	
	@OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
	private List<Employee> employees = new ArrayList<>();
	
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ArrayList<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(ArrayList<Employee> employees) {
		this.employees = employees;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public void addEmployee(Employee employee) {
		employees.add(employee);
		employee.setDepartment(this);
	}
	public void removeEmployee(Employee employee) {
		employees.remove(employee);
		employee.setName(null);
	}

}
