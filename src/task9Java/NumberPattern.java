package task9Java;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		
		//Initialization of Scanner Class
		Scanner in = new Scanner(System.in);
			
		//Get the input from the user
		System.out.println("Enter the number");
		int a = in.nextInt();
		
		int b=1;
		
		//Condition for iterating the row
		for(int i=1; i<=a; i++) {
			
			//Condition for iterating the column
			for(int j=1;j<=i;j++) {
				
				//to print the required output based on condition
				System.out.print(b+ " ");
				b++;
			}
			//Move to next line
			System.out.println();
		}
		
		//Dereference of Scanner object
		in.close();
	}

}
