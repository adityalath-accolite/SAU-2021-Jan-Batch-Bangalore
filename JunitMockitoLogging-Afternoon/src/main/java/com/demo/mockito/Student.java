package com.demo.mockito;

public class Student {
	private int id;
	private String firstName;
	private String lastName;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	private int standard;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getStandard() {
		return standard;
	}
	public void setStandard(int standard) {
		this.standard = standard;
	}
	public Student(int id, String firstName, String lastName, int standard) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.standard = standard;
	}
	
}
