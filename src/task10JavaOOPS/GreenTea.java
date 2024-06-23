package task10JavaOOPS;

public class GreenTea extends Tea {

	public static void main(String[] args) {
		
		System.out.println("Green Tea Preparation");
		GreenTea green=new GreenTea();
		green.prepareTea();
		green.addMilk();
		green.addSugar();
	}
	public void prepareTea() {
		System.out.println("Green Tea: Soaking green tea bags into the boiling water 2 mins, then remove the tea bags ");
	}
}
