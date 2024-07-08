package task10JavaOOPS;

import java.util.Scanner;

public class Employee {
	int id, salary;
	String firstName, lastName;

	public static void main(String[] args) {
		
		//Initialization of Scanner class
		Scanner in= new Scanner (System.in);
		
		//Pass the input from user
		System.out.println("Enter the id: ");
		int id =in.nextInt();
		
		System.out.println("Enter the firstname: ");
		String firstName = in.next();
		
		System.out.println("Enter the lastname: ");
		String lastName = in.next();
		
		System.out.println("Enter the salary: ");
		int salary= in.nextInt();
		
		System.out.println("Enter the hike percentage: ");
		int percent=in.nextInt();
		
		System.out.println("Enter the updated salary: ");
		int updatedSalary=in.nextInt();
		
		
		
		//Object creation for Employee class
		Employee obj= new Employee(id, firstName, lastName, salary);
		
		
		System.out.println("The Id is: "+obj.getId(id));
		System.out.println("The FirstName is: "+obj.getFirstName(firstName));
		System.out.println("The LasttName is: "+obj.getLastName(lastName));
		System.out.println("The Name is: "+obj.getName(firstName,lastName));
		System.out.println("The Salary is: "+obj.getSalary(salary));
		obj.setSalary(updatedSalary);
		System.out.println("The Updated Salary is: "+obj.getSalary(updatedSalary));
		System.out.println("The Annual Salary is: "+obj.getAnnualSalary(updatedSalary));
		System.out.println("The Raised Salary is: "+obj.raiseSalary(percent, updatedSalary));
		System.out.println(obj.toString());
		in.close();
	}

//Constructor
public Employee(int id, String firstName, String lastName, int salary) {
	 this.id=id;
	 this.firstName=firstName;
	 this.lastName=lastName;
	 this.salary=salary;	 
}

//method to get the id value
public int getId(int id) {
	return id;	
}

//method to get the firstname
public String getFirstName(String firstName) {
	return firstName;	
}

//method to get the lastname
public String getLastName(String lastName) {
	return lastName;	
}

//method to concat firstname and lastname
public String getName(String firstName,String lastName) {
	return (firstName+" "+lastName);	
}

//method to get the salary value
public int getSalary(int salary) {
	return salary;	
}

//method to set the updated salary value
public void setSalary(int updatedSalary) {
	this.salary=updatedSalary;	
}

////method to calacualte the annual salary 
public int getAnnualSalary(int updatedSalary) {
	int annualSalary= (12*updatedSalary);
	return annualSalary;	
}

//method to calculate the salary with hike percentage
public int raiseSalary(int percent,int updatedSalary) {
	 float percentCal= updatedSalary+(float)(updatedSalary/percent);
	 int result= (int) (percentCal*12);
	 return result;
}

//method to display the employee details
public String toString(){//overriding the toString() method  
	  return "Employee [ Id: "+id+", FirstName: "+firstName+", LastName: "+lastName+", Salary: "+salary+"]";  
	 }  
}