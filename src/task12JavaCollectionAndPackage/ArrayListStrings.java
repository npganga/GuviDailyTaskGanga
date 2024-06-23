package task12JavaCollectionAndPackage;

import java.util.ArrayList;

public class ArrayListStrings {

	public static void main(String[] args) {
		
		ArrayList<String> list= new ArrayList<String>();
		
		list.add("apple");
		list.add("banana");
		list.add("carrot");
		list.add("dragonfruit");
		
		System.out.println("The Arraylist of String is");
		for (String ls :list) {
			System.out.println(ls);
		}
		
		//remove elements in the array
		list.remove("carrot");
		
		System.out.println("The Arraylist of String after removing an element using the values");
		System.out.println(""+list);
		
		list.remove(0);
		
		System.out.println("The Arraylist of String after removing an element using the index");
		System.out.println(""+list);
		
		list.removeAll(list);
		System.out.println("The Arraylist of String after removing all elements ");
		System.out.println(""+list);
		}

}


