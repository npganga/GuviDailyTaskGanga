package task8JavaIntroduction;

import java.util.Scanner;

public class PrintSentenceTenTimes {

	public static void main(String[] args) {
		
		//Initialize Scanner class
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter the String to print 10 times");
		String msg= in.nextLine();
		
		//Condition to print the string 10 times
		for(int i=1; i<=10; i++) {
			System.out.println(msg);
		}
		
		//Dereference the Scanner class
		in.close();
	}

}
