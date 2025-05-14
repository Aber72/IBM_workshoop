package com.ibm.springjdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application
{
	public static void main( String[] args )
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		EmployeeJDBCTemplate employeeJDBCTemplate = (EmployeeJDBCTemplate) context.getBean("employeeJDBCTemplate");
		
//		System.out.println("Records Creation");
//		employeeJDBCTemplate.create("Anil", "Kumar", 11000);
		
//		System.out.println("---Listing Multiple Records");
//		List<Employee> employees = employeeJDBCTemplate.listEmployee();
//		for(Employee employee: employees) {
//			System.out.println("ID: "+ employee.getId());
//			System.out.println("First Name: "+ employee.getFirstName());
//			System.out.println("Last Name: "+ employee.getLastName());
//			System.out.println("Salary: "+ employee.getSalary());
//		}
//			
//			System.out.println("Get Employee by ID");
//	        Employee employee1 = employeeJDBCTemplate.getEmployee(1);
//	        System.out.println("ID: " + employee1.getId());
//	        System.out.println("First Name: " + employee1.getFirstName());
//	        System.out.println("Last Name: " + employee1.getLastName());
//	        System.out.println("Salary: " + employee1.getSalary());
	        
//	        //System.out.println("Delete Employee by ID");
//	        //employeeJDBCTemplate.delete(2);

	        System.out.println("Update Employee by ID");
	        employeeJDBCTemplate.update(1, "Amrit", "Kumar");
	        Employee employee1 = employeeJDBCTemplate.getEmployee(1);
	        System.out.println("ID: " + employee1.getId());
	        System.out.println("First Name: " + employee1.getFirstName());
	        System.out.println("Last Name: " + employee1.getLastName());
	        System.out.println("Salary: " + employee1.getSalary());



		
		}
	}
