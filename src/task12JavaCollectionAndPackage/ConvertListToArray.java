package task12JavaCollectionAndPackage;

import java.util.ArrayList;

public class ConvertListToArray {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		System.out.println("ArrayList elements: ");
		for(Integer in:list) {
			System.out.println(in);
		}
		
		System.out.println("ArrayList to Array");
		
		Object[] arrObj=list.toArray();
		for(Object arr: arrObj) {
			System.out.println(""+ arr);
		}		
		
	}

}
