package task9Java;

import java.util.Scanner;

public class HotelTariff {

	public static void main(String[] args) {
		
				//Initialize Scanner class to read input
				Scanner in = new Scanner(System.in);
				
				System.out.println("Enter the month's number:");
				int month = in.nextInt();
				
				System.out.println("Enter the rent per day:");
				float rent = in.nextFloat();
				
				System.out.println("Enter the number of days:");
				int days = in.nextInt();
				
				float percent = rent*(20/rent);
				
				
				switch(month) {
				
				case 1: 
					System.out.print("The rent is : "+String.format("%.2f",(rent*days)));
					break;
				case 2: 
					System.out.print("The rent is : "+String.format("%.2f",(rent*days)));
					break;
				case 3: 
					System.out.print("The rent is : "+String.format("%.2f",(rent*days)));
					break;
				case 4: 
					System.out.print("The rent is : "+String.format("%.2f",(rent+percent)*days));
					break;
				case 5: 
					System.out.print("The rent is : "+String.format("%.2f",(rent+percent)*days));
					break;
				case 6: 
					System.out.print("The rent is : "+String.format("%.2f",(rent+percent)*days));
					break;
				case 7: 
					System.out.print("The rent is : "+String.format("%.2f",(rent*days)));
					break;
				case 8: 
					System.out.print("The rent is : "+String.format("%.2f",(rent*days)));
					break;
				case 9: 
					System.out.print("The rent is : "+String.format("%.2f",(rent*days)));
					break;
				case 10: 
					System.out.print("The rent is : "+String.format("%.2f",(rent*days)));
					break;
				case 11: 
					System.out.print("The rent is : "+String.format("%.2f",(rent+percent)*days));
					break;
				case 12: 
					System.out.print("The rent is : "+String.format("%.2f",(rent+percent)*days));
					break;
				default:
					System.out.println("The entered number is not a month");  
				}	
				in.close();
	}
}
