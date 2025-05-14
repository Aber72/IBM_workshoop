package com.ibm.springjdbc;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class EmployeeJDBCTemplate implements EmployeeDAO {
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;

	@Override
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
		// TODO Auto-generated method stub

	}

	@Override
	public void create(String firstName, String lastName, Integer salary) {
		// TODO Auto-generated method stub
		String SQL = "insert into employees(firstName,lastName,salary) values(?,?,?)";
		jdbcTemplateObject.update(SQL,firstName,lastName,salary);
		System.out.println("created record name"+firstName+"salary"+salary);
		

	}

	@Override
	public Employee getEmployee(Integer id) {
		 String SQL = "select * from employees where id = ?";
	        EmployeeMapper employeeMapper = new EmployeeMapper();
	        Employee employee = jdbcTemplateObject.queryForObject(SQL, new Object[] { id }, employeeMapper);
	        return employee;

	}

	@Override
	public List<Employee> listEmployee() {
		// TODO Auto-generated method stub
		String SQL = "select * from employees";
        EmployeeMapper employeeMapper = new EmployeeMapper();
        List<Employee> employees = jdbcTemplateObject.query(SQL, employeeMapper);
        return employees;
		
		
	}

	@Override
	public void delete(Integer id) {
		 String SQL = "delete from employees where id = ?";
	        jdbcTemplateObject.update(SQL, id);
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Integer id, String firstName, String lastName) {
		// TODO Auto-generated method stub
		 String SQL = "update employees set firstName = ?, lastName = ? where id = ?";
	        jdbcTemplateObject.update(SQL, firstName, lastName, id);

	}

}