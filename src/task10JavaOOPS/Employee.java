package task10JavaOOPS;

import java.util.Scanner;

public class Employee {
	int id, salary;
	String firstName, lastName;

	public static void main(String[] args) {
		
		Scanner in= new Scanner (System.in);
		
		//Pass the input from userr
		int id =in.nextInt();
		String firstName = in.next();
		String lastName = in.next();
		int salary= in.nextInt();
		int percent=in.nextInt();
		int salary2=in.nextInt();
		
		Employee obj= new Employee(id, firstName, lastName, salary);
		//obj.Employee(id, firstName, lastName, salary);
		
		System.out.println("The Id is: "+obj.getId(id));
		System.out.println("The FirstName is: "+obj.getFirstName(firstName));
		System.out.println("The LasttName is: "+obj.getLastName(lastName));
		System.out.println("The Name is: "+obj.getName(firstName,lastName));
		System.out.println("The Salary is: "+obj.getSalary(salary));
		obj.setSalary(salary2);
		System.out.println("The Updated Salary is: "+obj.getSalary(salary2));
		System.out.println("The Annual Salary is: "+obj.getAnnualSalary(salary2));
		System.out.println("The Raised Salary is: "+obj.raiseSalary(percent, salary2));
		System.out.println(obj.toString());
		in.close();
	}


public Employee(int id, String firstName, String lastName, int salary) {
	 this.id=id;
	 this.firstName=firstName;
	 this.lastName=lastName;
	 this.salary=salary;	 
}
public int getId(int id) {
	return id;	
}
public String getFirstName(String firstName) {
	return firstName;	
}
public String getLastName(String lastName) {
	return lastName;	
}
public String getName(String firstName,String lastName) {
	return (firstName+" "+lastName);	
}
public int getSalary(int salary) {
	return salary;	
}
public void setSalary(int salary2) {
	this.salary=salary2;	
}
public int getAnnualSalary(int salary2) {
	int annualSalary= (12*salary);
	return annualSalary;	
}
public int raiseSalary(int percent,int salary2) {
	 float percentCal= salary+(float)(salary/percent);
	 int result= (int) (percentCal*12);
	 return result;
}
public String toString(){//overriding the toString() method  
	  return "Employee [ Id: "+id+", FirstName: "+firstName+", LastName: "+lastName+", Salary: "+salary+"]";  
	 }  
}