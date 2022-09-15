package com.example.demo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int personId;
private String personName;
private String personDesignation;
private String personSalary;
private String personLocation;
public int getPersonId() {
	return personId;
}
public void setPersonId(int personId) {
	this.personId = personId;
}
public String getPersonName() {
	return personName;
}
public void setPersonName(String personName) {
	this.personName = personName;
}
public String getPersonDesignation() {
	return personDesignation;
}
public void setPersonDesignation(String personDesignation) {
	this.personDesignation = personDesignation;
}
public String getPersonSalary() {
	return personSalary;
}
public void setPersonSalary(String personSalary) {
	this.personSalary = personSalary;
}
public String getPersonLocation() {
	return personLocation;
}
public void setPersonLocation(String personLocation) {
	this.personLocation = personLocation;
}
public Person(int personId, String personName, String personDesignation, String personSalary, String personLocation) {
	super();
	this.personId = personId;
	this.personName = personName;
	this.personDesignation = personDesignation;
	this.personSalary = personSalary;
	this.personLocation = personLocation;
}
public Person() {
	super();
	// TODO Auto-generated constructor stub
}


}

