package task8JavaIntroduction;

import java.util.Scanner;

public class SeniorCitizenOrNot {

	public static void main(String[] args) {
		
		//Initialize the Scanner class
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the age of the person:");
		int age=in.nextInt();
		
		//Senior citizen age limit is 60 or above and below 80
		if( (age>=60) && (age<80) ) {
			System.out.println("The person with the age "+age+" is a senior citizen");
		}
		else {
			System.out.println("The person with the age "+age+" is not a senior citizen");
		}
		
		//dereference the scanner class
		in.close();
	}

}
