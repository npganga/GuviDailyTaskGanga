package task8JavaIntroduction;

import java.util.Scanner;

public class StringLength {

	public static void main(String[] args) {
		
		//Initialize Scanner class to read input from user
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the string:");
		String msg= in.nextLine();//Guvi Geeks as input
		
		System.out.println("The length of the given string "+msg+" is "+msg.length());
		
		in.close();
	}

}
