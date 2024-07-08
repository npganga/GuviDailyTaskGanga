package task12JavaCollectionAndPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class ConvertListToArray {

	public static void main(String[] args) {
		
		//Intialization of Scanner Class
		Scanner in = new Scanner(System.in);
		
		//Initialization of Integer type ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//Get the length of the arrayList
		System.out.println("The size of the ArrayList is:");
		int size =in.nextInt();
				
		System.out.println("Pass the values to the ArrayList: ");
		for(int i=0;i<size;i++) {
		int element = in.nextInt();
		list.add(element);
		}
		
		System.out.println("ArrayList elements: ");
		for(Integer input:list) {
			System.out.println(input);
		}
		
		System.out.println("ArrayList to Array");
		
		Object[] arrObj=list.toArray();
		for(Object arr: arrObj) {
			System.out.println(""+ arr);
		}		
		
		//Dereference the Scanner class
		in.close();
	}

}
