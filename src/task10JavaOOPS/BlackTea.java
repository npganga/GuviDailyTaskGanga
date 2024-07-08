package task10JavaOOPS;

public class BlackTea extends Tea{

	public static void main(String[] args) {
		
		System.out.println("Black Tea Preparation");
		
		//Object creation
		BlackTea black=new BlackTea();
		
		//Calling methods
		black.prepareTea();
		black.addMilk();
		black.addSugar();
		
	}
	
	//Method override from tea class
	public void prepareTea() {
		System.out.println("Black Tea: Boil the  water with tea leaves for about 5 mins and drain the tea leaves");
	}
}
