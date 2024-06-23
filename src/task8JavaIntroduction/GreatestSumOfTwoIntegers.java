package task8JavaIntroduction;

import java.util.Scanner;

public class GreatestSumOfTwoIntegers {

	public static void main(String[] args) {
		
		//Initialize Scanner class to read input
		Scanner in = new Scanner(System.in);
		
		//Assigning values for the variables a, b, c, d
		System.out.print("Enter the value for a:");
		int a = in.nextInt();
		System.out.print("Enter the value for b:");
		int b= in.nextInt();
		System.out.print("Enter the value for c:");
		int c= in.nextInt();
		System.out.print("Enter the value for d:");
		int d = in.nextInt();
		
		//Verifying the addition of a and b is greater than the addition of c and d
		if ((a+b)> (c+d)) {
			System.out.println("The sum of a '"+a +"' and b '"+b +"' is greater than the sum of c '"+c +"' and d '"+d+"'" );
		}
		else if((a+b)< (c+d)) {
			System.out.println("The sum of c '"+c +"' and d '"+d +"' is greater than the sum of a '"+a +"' and b '"+b+"'" );
		}
		else if((a+b) == (c+d)){
			System.out.println("The sum of c '"+c +"' and d '"+d +"' is equals to the sum of a '"+a +"' and b '"+b+"'" );
		}
		//Deference the Scanner object		
		in.close();
	}

}
