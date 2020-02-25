package com.cms.deloitte.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="EmployeeDetail")
public class EmployeeDetail {
@Id
@GeneratedValue
@Column
	private int empId;
	
@Column
private String empName;
@Column
private int empNo;
@Column
private String empMail;
	@OneToMany(mappedBy = "employeedetail")
	private Set<ProjectDetail> projdetails=new HashSet<ProjectDetail>();
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpMail() {
		return empMail;
	}
	public void setEmpMail(String empMail) {
		this.empMail = empMail;
	}
	public Set<ProjectDetail> getProjdetails() {
		return projdetails;
	}
	public void setProjdetails(Set<ProjectDetail> projdetails) {
		this.projdetails = projdetails;
	}
	
	
}
