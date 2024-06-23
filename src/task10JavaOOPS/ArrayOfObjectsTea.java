package task10JavaOOPS;

public class ArrayOfObjectsTea {

	public static void main(String[] args) {
		
		Tea obj[]=new Tea[4];
		
		obj[0]=new Tea();
		obj[1]=new BlackTea();
		obj[2]=new GreenTea();
		obj[3]=new HerbalTea();

		for(int i=0;i<4;i++) {
		obj[i].prepareTea();
		obj[i].addMilk();
		obj[i].addSugar();
		}
	}

}
