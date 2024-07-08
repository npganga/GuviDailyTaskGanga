package task12JavaCollectionAndPackage;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListStrings {

	public static void main(String[] args) {
		
		//Intialization of Scanner Class
		Scanner in = new Scanner(System.in);
		
		//Create ArrayList
		ArrayList<String> list= new ArrayList<String>();
		
		//Get the length of the arrayList
		System.out.println("The size of the ArrayList is:");
		int size =in.nextInt();
		
		System.out.println("Pass the values to the ArrayList: ");
		for(int i=0;i<size;i++) {
			String element = in.next();
			list.add(element);
		}
		
		System.out.println("The Arraylist contains: ");
		for (String ls :list) {
			System.out.println(ls);
		}
		
		
		String LastElement =list.get(size-1);
		//Remove element with the value in the ArrayList
		list.remove(LastElement);
		
		System.out.println("The Arraylist of String after removing an element using the value");
		System.out.println(""+list);
		
		//remove element with the index 0 in the ArrayList
		list.remove(0);
		
		System.out.println("The Arraylist of String after removing an element using the index");
		System.out.println(""+list);
		
		
		//Remove all the elements in the ArrayList
		list.removeAll(list);
		System.out.println("The Arraylist of String after removing all elements ");
		System.out.println(""+list);
		
		
		//Dereference the Scanner class
		in.close();
		}

}


