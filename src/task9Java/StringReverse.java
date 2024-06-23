package task9Java;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {

		//Initialization of Scanner class
		Scanner in= new Scanner(System.in);
		
		System.out.println("Enter the string:");
		String strOriginal=in.next();
		
		//Store the string in character array
		char[] toreverse= strOriginal.toCharArray();
	
		//Reversing the given string
		 for(int i=(strOriginal.length()-1); i>=0;i--) {
			 System.out.print(toreverse[i]);
		 }
		 in.close();
	}

}
