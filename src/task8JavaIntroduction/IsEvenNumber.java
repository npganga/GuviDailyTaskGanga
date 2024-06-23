package task8JavaIntroduction;

import java.util.Scanner;

public class IsEvenNumber {

	public static void main(String[] args) {
				
				//Initialize Scanner class to read input
				Scanner in = new Scanner(System.in);
				
				//Assigning values for the variable a
				System.out.print("Enter the value for a:");
				int a = in.nextInt();
				
				//Verifying the given input number a is even number
				if ((a%2) ==0) {
					System.out.println("The given number "+a+" is a even number." );
				}
				
				//Deference the Scanner object		
				in.close();
	}

}
