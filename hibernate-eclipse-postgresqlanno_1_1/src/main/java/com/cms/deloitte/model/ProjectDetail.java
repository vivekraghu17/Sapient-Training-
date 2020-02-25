package com.cms.deloitte.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="ProjectDetail")
public class ProjectDetail {
@Id
@GeneratedValue
@Column
private int projectId;
@Column
private String projectName;

@Column
private String projectLocation;

@ManyToOne
@JoinColumn(name="empid")
private EmployeeDetail employeedetail;

public int getProjectId() {
	return projectId;
}

public void setProjectId(int projectId) {
	this.projectId = projectId;
}

public String getProjectName() {
	return projectName;
}

public void setProjectName(String projectName) {
	this.projectName = projectName;
}

public String getProjectLocation() {
	return projectLocation;
}

public void setProjectLocation(String projectLocation) {
	this.projectLocation = projectLocation;
}

public EmployeeDetail getEmployeedetail() {
	return employeedetail;
}

public void setEmployeedetail(EmployeeDetail employeedetail) {
	this.employeedetail = employeedetail;
}	
	
	

}
