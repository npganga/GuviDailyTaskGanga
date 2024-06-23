package task10JavaOOPS;

public class HerbalTea extends Tea{

	public static void main(String[] args) {
		
		System.out.println("Herbal Tea Preparation");
		HerbalTea herbal=new HerbalTea();
		herbal.prepareTea();
		herbal.addMilk();
		herbal.addSugar();

	}
	public void prepareTea() {
		System.out.println("Herbal Tea: Adding herbs to the hot water and boils for 5 mins, then drain the herbs");
	}

}
