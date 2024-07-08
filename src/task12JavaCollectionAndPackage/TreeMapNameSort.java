package task12JavaCollectionAndPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapNameSort {

	public static void main(String[] args) {
		
		
		 //Intialization of Scanner Class
		 Scanner in = new Scanner(System.in);
				
		 //Intialization of Tree Map
		 Map< Integer, String> treeMap = new TreeMap<>();
		
		 //Get the length of the arrayList
		 System.out.println("The size of the TreeMap is:");
		 int size =in.nextInt();
			
		 System.out.println("Pass the values to the TreeMap: ");
		 for(int i=0;i<size;i++) {
		 String element = in.next();
		 treeMap.put(i, element);
		 }
		 
		 
		 System.out.println("Tree Map elements consisits of Employee Id and Name");
		 for(Integer key:treeMap.keySet()) {
			 System.out.println(key+" "+treeMap.get(key));
		 }
		 
		 //Sorting
		 
		 //Make as ArrayList with the values of TreeMap
		 ArrayList<String> keyList= new ArrayList<String>(treeMap.values());
		 
		 //To sort the ArrayList
		 Collections.sort(keyList); 
		 
		 //To print in Alphabetical order
		 System.out.println("In Alphabetical Order:");
		 for(String ls: keyList)
		 System.out.println(ls);
		  
		 //Dereference the Scanner class
		 in.close();
	}

}

