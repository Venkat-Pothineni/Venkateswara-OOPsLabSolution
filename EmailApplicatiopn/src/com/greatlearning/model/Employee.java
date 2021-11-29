package com.greatlearning.model;

public class Employee {
	
	private String firstName;
	private String lastName;
	
	public Employee() {
		
	}
	
	public Employee(String fName, String lName) {
		this.firstName=fName;
		this.lastName=lName;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	

}
