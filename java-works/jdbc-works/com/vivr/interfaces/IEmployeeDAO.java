package com.vivr.interfaces;

import java.util.List;

import com.vivr.beans.Employee;

public interface IEmployeeDAO {
	public boolean insertEmployee(Employee employee);
	public boolean deleteEmployee(int empId);
	public boolean updateEmployeeSalary(int empId, double empSal);
	public Employee getemployee(int empId);
	public List<Employee> getAllEmployees();
	
}
