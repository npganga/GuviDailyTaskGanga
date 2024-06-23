package task8JavaIntroduction;

import java.util.Scanner;

public class PrimeNumberOrNot {

	public static void main(String[] args) {
		
		//Initialize Scanner class to read input
		Scanner in = new Scanner(System.in);
		
		//Assigning values for the variable a
		System.out.print("Enter the value for a:");
		int a = in.nextInt();
		
		int j=0;
		
		//Verifying the given input number a is prime number or not
		for (int i=1; i<=a; i++) {
			
			//A number which returns reminder 0 for 1 and by the same number will be Prime
			if(a%i==0) {
				j++;
			}
		}
		
		//j value is 2 when the given number has reminder 0 for 1 and its number 
		if(j==2){
			System.out.println("The given number "+a+" is a prime number");
		}
		// j value is more than 2, then it is not a prime number
		else{
			System.out.println("The given number "+a+" is not a prime number");
		}
		
		//Deference the Scanner object		
		in.close();

	}

}
