package task8JavaIntroduction;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		//Initialize Scanner class to read input
		Scanner in = new Scanner(System.in);
		
		//Assigning value for the variable a 
		System.out.print("Enter the value for a:");
		int a = in.nextInt();
		
		int factorial=1;
		
		//Deriving factorial for a given number
		for( int i=1; i<=a; i++) {
			factorial*=i;
		}
		
		System.out.println("The Factorial of "+a+" is "+ factorial);
		
		in.close();

	}

}
