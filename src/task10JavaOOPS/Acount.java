package task10JavaOOPS;

import java.util.Scanner;

public class Acount {

		float balance;
		float withdraw;
		float deposit;
		
		public static void main(String[] args) {
			
			float withdraw1;
			float deposit1;
			Scanner in =new Scanner(System.in);
			float input= in.nextFloat();
			withdraw1= in.nextFloat();
			deposit1= in.nextFloat();
			
			new Acount();
			Acount obj = new Acount(withdraw1,deposit1);
			
			System.out.println(""+obj.withdrawAccount(withdraw1, input));
			System.out.println(""+obj.depositAccount(deposit1, input));
			in.close();
		}
		public Acount() {
			System.out.println("The account balance");
		}
		public Acount(float withdraw1, float deposit1) {
			withdraw=withdraw1;
			deposit=deposit1;
		}
		
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
		public float depositAccount(float deposit,float input) {
			this.balance=input;
			System.out.print("The balance after deposit is :");
			return(balance+deposit);
		}
}
