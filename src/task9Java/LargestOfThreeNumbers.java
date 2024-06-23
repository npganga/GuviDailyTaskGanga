package task9Java;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		
		//Initialization of Scanner Class
		Scanner in=new Scanner(System.in);
		
		//Read the input from the user for num1, num2, num3
		System.out.println("Enter the 3 numbers:");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		int num3 = in.nextInt();
		int large =0; //To store largest value among the three numbers
		
		//All the three numbers are different 
		if((num1>num2)&&(num1>num3)) {
			large =num1;
		}
		if((num2>num1)&&(num2>num3)) {
			large =num2;
		}
		if((num3>num2)&&(num3>num2)) {
			large =num3;
		}
		
		//All the three numbers are same
		if((num1==num2)&&(num1==num3)) {
			large = num1;
		}
		
		//Any of the two numbers are same
		if((num1==num2)&&(num1>num3)) {
			large = num1;
		}
		if((num1==num2)&&(num1<num3)) {
			large = num3;
		}
		if((num1==num3)&&(num1>num3)) {
			large = num1;
		}
		if((num1==num3)&&(num1<num3)) {
			large = num3;
		}
		if((num2==num3)&&(num2>num1)) {
			large = num2;
		}
		if((num2==num3)&&(num2<num1)) {
			large = num1;
		}
	
		//To print the largest number
		System.out.println("The largest number is "+large);
		
		//Dereference the scanner object
		in.close();
	}

}
