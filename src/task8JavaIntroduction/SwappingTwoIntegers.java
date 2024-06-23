package task8JavaIntroduction;

import java.util.Scanner;

public class SwappingTwoIntegers {

	public static void main(String[] args) {
	
		//Initialize Scanner class to read input
		Scanner in = new Scanner(System.in);
				
		//Assigning values for the variables a and b
		System.out.print("The value for a:");
		int a = in.nextInt();
		System.out.print("The value for b:");
		int b= in.nextInt();
		
		System.out.println("The values of a and b before swapping is "+a+" and "+b);
		
		//additional variable to support swapping 
		int c;
		
		c=a;
		a=b;
		b=c;
		
		System.out.println("The values of a and b after swapping is "+a+" and "+b);

		in.close();
	}

}
