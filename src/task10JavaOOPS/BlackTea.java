package task10JavaOOPS;

public class BlackTea extends Tea{

	public static void main(String[] args) {
		
		System.out.println("Black Tea Preparation");
		BlackTea black=new BlackTea();
		black.prepareTea();
		black.addMilk();
		black.addSugar();
		
	}
	public void prepareTea() {
		System.out.println("Black Tea: Boil the  water with tea leaves for about 5 mins and drain the tea leaves");
	}
}
