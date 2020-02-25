package com.company.springbootworks.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.company.springbootworks.beans.Employee;
import com.company.springbootworks.exception.UserNotFoundException;
import com.company.springbootworks.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/emps")
	public List<Employee> getAllEmployees() {
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/emps/{empId}")
	public HttpEntity<Employee> getEmployee(
			@PathVariable
			int empId) {
		//return employeeService.findOneEmployee(empId);
		Employee employee = employeeService.findOneEmployee(empId);
		
		// If the user is NULL then,
		// throw new UserNotFoundException("");
		if(employee == null) {
			throw new UserNotFoundException("Sorry, User not found");	
		}
		
		
		Employee emp = employee.add(linkTo(methodOn(EmployeeController.class).getAllEmployees()).withSelfRel());
		
		
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
	}
	
	@PostMapping("/emps")
	public Employee saveEmployee(
			@RequestBody
			Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	/*@PostMapping("/emps")
	public HttpEntity<Employee> saveEmployee(
			@RequestBody
			Employee employee) {
		Employee emp = employeeService.saveEmployee(employee);
		return new ResponseEntity<Employee>(emp, HttpStatus.CREATED);
		
	}*/
	
	@PutMapping("/emps")
	public Employee updateEmployee(
			@RequestBody
			Employee employee) {
		return employeeService.updateEmployee(employee);
	}
	
	@DeleteMapping("/emps/{empId}")
	public Employee deleteEmployee(
			@PathVariable
			int empId) {
		return employeeService.deleteEmployee(empId);
	}
}
