package com.example.LambdaComparator;

public class Players {
	
	String firstName;
	String lastName;
	int number;
	public Players(String firstName, String lastName, int number) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.number =number;

	}
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
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	

}
