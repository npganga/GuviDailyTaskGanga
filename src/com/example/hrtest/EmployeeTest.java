package com.example.hrtest;
import java.util.Scanner;

import com.example.hr.*;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String employeeName = in.next();
		int employeeId = in.nextInt();
		double employeeSalary = in.nextDouble();
		Employee obj= new Employee();
		
		
		obj.printName(employeeName);
		obj.printSalary(employeeSalary);
		
		in.close();
	}

}
