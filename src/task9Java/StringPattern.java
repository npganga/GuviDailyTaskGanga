package task9Java;

import java.util.Scanner;

public class StringPattern {

	public static void main(String[] args) {
		
				//Initialization of Scanner Class
				Scanner in = new Scanner(System.in);
					
				//Get the input from the user
				System.out.println("Enter the number");
				int a = in.nextInt();
				int b=a;
				
				//Condition for iterating the row
				for(int i=1; i<=a; i++) {
					
					// Condition for iterating the column
					for(int j=1;j<=a;j++) {
						
						//Condition to print *
						if((i==j) || (j==b)) {
						System.out.print("*");
						}
						
						//to print " " space
						else{
							System.out.print(" ");
						}
					}
					
					b--;
					
					//To go next line in the interation
					System.out.println();
				}
				
				//Dereference of Scanner object
				in.close();
	}

}
