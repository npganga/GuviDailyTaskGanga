package task10JavaOOPS;

public class Tea {

	public static void main(String[] args) {
		
		System.out.println("Basic Tea Preparation");
		//Object created for tea class
		Tea obj=new Tea();
		
		//Calling methods of Tea class
		obj.prepareTea();
		obj.addMilk();
		obj.addSugar();
	
	}

// Prepare Tea method
public void prepareTea() {
	System.out.println("Basic Tea: Boil the water with tea leaves for 2 mins and drain the tea leaves");
}

//Add Milk method
public void addMilk() {
	System.out.println("Add milk to the tea");
}

//Add Sugar method
public void addSugar() {
	System.out.println("Add sugar to the tea and stir well");
}
}
