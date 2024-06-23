package task9Java;

import java.util.Scanner;

public class GradingSystem {

	public static void main(String[] args) {
		
		//Initialize Scanner class to read input
		Scanner in = new Scanner(System.in);
		
		//Assigning values for the variable a
		System.out.print("Enter the score:");
		int score = in.nextInt();
		
		System.out.print("The Grade is:");
		if((score>100)||(score<=0)) {
			System.out.println("Invalid Input");
		}
		else if(score==100){
			System.out.println("Invalid Input");
		}
		else if((score<=99)&&(score>=90)){
			System.out.println("A");
		}
		else if((score<=89)&&(score>=80)){
			System.out.println("B");
		}
		else if((score<=79)&&(score>=70)){
			System.out.println("C");
		}
		else if((score<=69)&&(score>=60)){
			System.out.println("D");
		}
		else if((score<=59)&&(score>=50)){
			System.out.println("E");
		}
		else if(score<=50){
			System.out.println("F");
		}
		in.close();
	}

}
