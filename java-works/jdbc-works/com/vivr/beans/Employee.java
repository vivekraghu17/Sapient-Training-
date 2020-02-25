package com.vivr.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString

public class Employee {
	private int EmpId;
	private String EmpName;
	private double EmpSal;
	private String EmpEmail;
	private int DeptId;
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public double getEmpSal() {
		return EmpSal;
	}
	public void setEmpSal(double empSal) {
		EmpSal = empSal;
	}
	public String getEmpEmail() {
		return EmpEmail;
	}
	public void setEmpEmail(String empEmail) {
		EmpEmail = empEmail;
	}
	public int getDeptId() {
		return DeptId;
	}
	public void setDeptId(int deptId) {
		DeptId = deptId;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, double empSal, String empEmail, int deptId) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpSal = empSal;
		EmpEmail = empEmail;
		DeptId = deptId;
	}
	
	
}
