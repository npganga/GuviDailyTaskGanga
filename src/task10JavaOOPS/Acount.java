package task10JavaOOPS;

import java.util.Scanner;

public class Acount {

		float balance;
		float withdraw;
		float deposit;
		
		public static void main(String[] args) {
			
			float withdraw1;
			float deposit1;
			//Initialization of Scanner class
			Scanner in =new Scanner(System.in);
			
			System.out.println("Enter the account balance: ");
			float input= in.nextFloat();
			
			System.out.println("Enter the amount to be withdraw: ");
			withdraw1= in.nextFloat();

			System.out.println("Enter the amount to be deposit: ");
			deposit1= in.nextFloat();
			
			//object Creation
			new Acount();
			Acount obj = new Acount(withdraw1,deposit1);
			
			//Withdraw from the account
			System.out.println(""+obj.withdrawAccount(withdraw1, input));
			
			//Deposit to the account
			System.out.println(""+obj.depositAccount(deposit1, input));
			
			//Dereference the scanner class
			in.close();
		}
		
		//Constructor with no parameter
		public Acount() {
			System.out.println("The account balance");
		}
		
		//Constructor with two parameter
		public Acount(float withdraw1, float deposit1) {
			withdraw=withdraw1;
			deposit=deposit1;
		}
		
		//Method for withdraw from the account
		public Object withdrawAccount(float withdraw,float input) {
			balance=input;
			if(balance>=withdraw) {
				balance=balance-withdraw;
				System.out.print("The balance after withdraw is : ");
				return balance;
			}
			else {
				System.out.print("Withdraw amount is greater than the balance amount ");
				return balance;
			}	
		}
		
		//method for deposit to the account
		public float depositAccount(float deposit,float input) {
			System.out.print("The balance after deposit is :");
			return(balance+deposit);
		}
}
