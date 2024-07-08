package task10JavaOOPS;

public class HerbalTea extends Tea{

	public static void main(String[] args) {
		
		System.out.println("Herbal Tea Preparation");
		
		//Object Creation
		HerbalTea herbal=new HerbalTea();
		
		//Calling methods
		herbal.prepareTea();
		herbal.addMilk();
		herbal.addSugar();

	}
	
	//Method overriding from Tea Class
	public void prepareTea() {
		System.out.println("Herbal Tea: Adding herbs to the hot water and boils for 5 mins, then drain the herbs");
	}

}
