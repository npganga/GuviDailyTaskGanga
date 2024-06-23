package task8JavaIntroduction;

import java.util.Scanner;

public class CountNumberOfDigits {

	public static void main(String[] args) {
		
		//Initialize Scanner class to read input
		Scanner input = new Scanner(System.in);
		
		//Assigning values for the variable a
		System.out.print("Enter the value for a:");
		int a = input.nextInt();
		
		int number =a;
		
		//Dereference the Scanner class
		input.close();
				
		//Condition to find the number of digits in the given integer
		int i=1;
		
		if(a!=0) {
			for(i=0;a!=0;i++) {
				a = a/10;
			}
		}
	
		System.out.println("The number of digits in the given integer "+number+" is "+i);
		
	}

}
