package task10JavaOOPS;

import java.util.Scanner;

public class TaskOne {

	public static void main(String[] args) {

		//Initialization of Scanner class
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the name:");
		String username= in.next();
		
		System.out.println("Enter the age:");
		int userage= in.nextInt();
		
		//object creation for Person class
		Person obj = new Person();
		
		//accessing the person constructor 
		obj.person(username, userage);
		
		//accessing the getName and getAge methods from Person class to print name and age
		System.out.println("The name :"+obj.getName(username));
		System.out.println("The age :"+obj.getAge(userage));
		
		//dereference the scanner class
		in.close();
	}

}

