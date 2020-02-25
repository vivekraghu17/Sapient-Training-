package com.vivr.app;

import com.vivr.beans.Employee;
import com.vivr.dao.EmployeeDAO;
import com.vivr.interfaces.IEmployeeDAO;

public class EmployeeApp {
	public static void main(String[] args) {
		IEmployeeDAO dao=new EmployeeDAO();
		
		Employee employee = new Employee(141,"Sammy",4444,"sammy@ps.com",10);
		
		System.out.println(dao.insertEmployee(employee)?"Inserted":"Sorry Not Inserted");
	}

} 