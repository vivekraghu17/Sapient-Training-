package com.company.springbootworks.beans;

import org.springframework.hateoas.RepresentationModel;

public class Employee extends RepresentationModel<Employee> {
	private int id;
    private String empName;
    private int empAge;
    private String email;
    private Address address;
    
   
    public Employee() {}
    
	public Employee(int id, String empName, int empAge, String email, Address address) {
		super();
		this.id = id;
		this.empName = empName;
		this.empAge = empAge;
		this.email = email;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
    
    
}
