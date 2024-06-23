package task12JavaCollectionAndPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapNameSort {

	public static void main(String[] args) {
		
		 Map< Integer, String> treeMap = new TreeMap<>();
		 
		 treeMap.put(1,"Vijay");
		 treeMap.put(2,"Arun");
		 treeMap.put(3, "Aravind");
		 
		 System.out.println("Tree Map elements consisits of Employee Id and Name");
		 for(Integer key:treeMap.keySet()) {
			 System.out.println(key+" "+treeMap.get(key));
		 }
		 //Sorting
		 ArrayList<String> keyList= new ArrayList<String>(treeMap.values());
		 
		 System.out.println("Employee Name is sorted in Alphabetical order");
		 Collections.sort(keyList); 
		 for(String ls: keyList)
		 System.out.println(ls);
		  
	}

}
