package task9Java;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		//Initialization of Scanner class
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter the string:");
		String check=in.next();
		 
		int count=0;
		
		//Get the length of the string
		int checklength = check.length();
		
		//Initialize char array to store the string
		char[] arr = new char[checklength];
		
		//Assigning the string of each character to the character array
		for( int i=0; i<checklength; i++) {
			arr[i]= check.charAt(i);	
		}
		
		//Verifying the given string is palindrome or not
		for( int k=0; k<(checklength/2); k++ ) {
			int j=(checklength-1)-k;
				if(arr[k] ==arr[j]) {
					count++;
				}
		}
		
		//validating the condition of palindrome
		if(count==(checklength/2)) {
			System.out.println("The given string '"+check+"' is palindrome");
		}
		else {
			System.out.println("The given string '"+check+"' is not a palindrome");
		}
		in.close();
	}
}
