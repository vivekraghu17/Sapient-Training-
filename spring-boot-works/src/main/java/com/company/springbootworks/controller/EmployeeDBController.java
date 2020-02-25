package com.company.springbootworks.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.company.springbootworks.beans.Employee;
import com.company.springbootworks.service.EmployeeDBService;

 
@Controller
public class EmployeeDBController {
    
    @Autowired
    private EmployeeDBService employeeService;
    
    @PostMapping("/db/emps")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return employeeService.insertEmployee(employee);
    }
    
    @GetMapping("/db/emps")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
    
    @GetMapping("/db/emps/{empId}")
    public Optional<Employee> getEmployee(@PathVariable int empId) {
        return employeeService.getEmployeeById(empId);
    }
    
    @PutMapping("/db/emps/")
    public Employee updateEmployee(@RequestBody Employee employee) {
        return employeeService.updateEmployee(employee);
    }
 
    @DeleteMapping("/db/emps/{empId}")
    public void deleteEmployee(@PathVariable int empId) {
    	employeeService.deleteEmployee(empId);
    }
    
    @GetMapping("/db/emps/age/{empAge}")
    public List<Employee> getEmployeeGreaterThanAge(@PathVariable int empAge) {
    	return employeeService.getEmployeeByAge(empAge);
    }
}