package com.example.hr;

public class Employee {
	
	String name;
	int id;
	double salary;
	
	public void printName(String name) {
		System.out.println("The employee's name is: "+name);
	}
	
	public void printSalary(double salary) {
		System.out.println("The employee's salary is: "+salary);
	}
}
