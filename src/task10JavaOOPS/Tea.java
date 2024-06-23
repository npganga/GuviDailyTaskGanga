package task10JavaOOPS;

public class Tea {

	public static void main(String[] args) {
		
		System.out.println("Basic Tea Preparation");
		
		Tea obj=new Tea();
		obj.prepareTea();
		obj.addMilk();
		obj.addSugar();
	
	}
public void prepareTea() {
	System.out.println("Basic Tea: Boil the water with tea leaves for 2 mins and drain the tea leaves");
}
public void addMilk() {
	System.out.println("Add milk to the tea");
}
public void addSugar() {
	System.out.println("Add sugar to the tea and stir well");
}
}
