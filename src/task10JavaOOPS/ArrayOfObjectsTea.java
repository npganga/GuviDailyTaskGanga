package task10JavaOOPS;

public class ArrayOfObjectsTea {

	public static void main(String[] args) {
		
		//Creating Array of Objects
		Tea obj[]=new Tea[4];
		
		//Declaring objects to each class
		obj[0]=new Tea();
		obj[1]=new BlackTea();
		obj[2]=new GreenTea();
		obj[3]=new HerbalTea();

		//Calling methods of each classes
		for(int i=0;i<4;i++) {
		obj[i].prepareTea();
		obj[i].addMilk();
		obj[i].addSugar();
		System.out.println();
		}
	}

}
