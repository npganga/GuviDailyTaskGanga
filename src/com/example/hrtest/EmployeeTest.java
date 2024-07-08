package com.example.hrtest;
import java.util.Scanner;

import com.example.hr.*;

public class EmployeeTest {

	public static void main(String[] args) {
		
		//Initialization of Scanner class
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the Employee Name: ");
		String employeeName = in.next();
		
		System.out.println("Enter the Employee Id: ");
		int employeeId = in.nextInt();
		
		System.out.println("Enter the Employee Salary: ");
		double employeeSalary = in.nextDouble();
		
		//Object Creation
		Employee obj= new Employee();
		
		//Calling methods to print Name and Salary of the employee
		obj.printName(employeeName);
		obj.printSalary(employeeSalary);
		
		//Dereferernce the Scanner Class
		in.close();
	}

}
