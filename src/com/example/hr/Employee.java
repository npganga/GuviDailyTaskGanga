package com.example.hr;

public class Employee {
	
	String name;
	int id;
	double salary;
	
	//Method to print the employeeName
	public void printName(String name) {
		this.name=name;
		System.out.println("The employee's name is: "+this.name);
	}
	
	//Method to print the employee salary
	public void printSalary(double salary) {
		this.salary=salary;
		System.out.println("The employee's salary is: "+this.salary);
	}
}