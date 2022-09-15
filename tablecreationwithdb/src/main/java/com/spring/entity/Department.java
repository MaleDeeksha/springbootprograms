package com.spring.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int dId;
private String dName;
@OneToMany(cascade = CascadeType.ALL)
private Set<Employee>employee;

public int getdId() {
	return dId;
}
public void setdId(int dId) {
	this.dId = dId;
}
public String getdName() {
	return dName;
}
public void setdName(String dName) {
	this.dName = dName;
}
	// TODO Auto-generated constructor stub
public Set<Employee> getEmployee() {
	return employee;
}
public void setEmployee(Set<Employee> employee) {
	this.employee = employee;
}

}
