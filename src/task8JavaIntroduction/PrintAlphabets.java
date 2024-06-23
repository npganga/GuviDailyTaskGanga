package task8JavaIntroduction;

public class PrintAlphabets {

	public static void main(String[] args) {
		
		System.out.println("To print characters from A to Z:");
		//Print A to Z by using ASCII Values 
		for(int i =65; i<=90 ; i++) {
			
			// Updating ASCII Values to its Characters 
			char a= (char)i;
			
			// Print A to Z
			System.out.print(a+" ");
		}

	}

}
