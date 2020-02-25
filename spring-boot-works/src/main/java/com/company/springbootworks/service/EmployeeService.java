package com.company.springbootworks.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Component;

import com.company.springbootworks.beans.Address;
import com.company.springbootworks.beans.Employee;

@Component
public class EmployeeService {
	private static List<Employee> employees = new ArrayList<Employee>();
	
	static {
		employees.add(new Employee(101, "Yateesh", 22, "yatch@pact.com",
				new Address("101", "Greenwood", "Reston", "USA")));
		employees.add(new Employee(121, "Preetish", 12, "pret@pet.com",
				new Address("301", "yellowstone", "LA", "USA")));
		employees.add(new Employee(456, "Lobster", 62, "Kill@pill.com",
				new Address("678", "Jockeywookie", "Cupertino", "USA")));
		employees.add(new Employee(345, "Micheal", 99, "mich@pact.com",
				new Address("564", "GG Palya", "Bengaluru", "INDIA")));
		employees.add(new Employee(908, "Yerser", 54, "hhtj@pact.com",
				new Address("866", "JillHill", "Reston", "USA")));
	}
	
	// CRUD
	
	public List<Employee> getAllEmployees() {
		return employees;
	}
	
	public Employee saveEmployee(Employee employee) {
		if(employee.getId() == 0)
			employee.setId(employees.size() + 1);
		employees.add(employee);
		
		return employee;
	}
	
	public Employee findOneEmployee(int empId) {
		for(Employee emp:employees) {
			if(emp.getId()==empId) {
				return emp;
			}
		}
		return null;
	} 
	
	public Employee updateEmployee(Employee employee) {
		this.deleteEmployee(employee.getId());
		employees.add(employee);
		return employee;
	}
	
	public Employee deleteEmployee(int empId) {
		for(Employee emp : employees) {
			if(emp.getId() == empId) {
				employees.remove(emp);
				return emp;
			}
		}
		return null;
	}
	
}
