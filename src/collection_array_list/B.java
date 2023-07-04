package collection_array_list;

import java.util.ArrayList;

public class B {

	public static void main(String []args) {
		
		// adding the value in arrayList with insertion order
		
		ArrayList a1 = new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(1,50);     					//add(index, element)
		
		System.out.println(a1);
		System.out.println(a1.get(1));   	// getting the value back based on index number
		
		
		ArrayList a2 = new ArrayList();   	// another collection of array List
		a2.add("hello");
		a2.add("My ");
		a2.add("Name is");
		System.out.println(a2);
		
		a1.add(2,a2);                    	// adding the 2nd arrayList at index 2
		System.out.println(a1);
											// checking whether value is present or not
		if(a1.contains(50)) {
			System.out.println("Yes Present");
		}else {
			System.out.println("the value not present");
		}
		
		//Removing the element from index
		a1.remove(2);
		System.out.println(a1);
		System.out.println(a1.size());
		
		System.out.println(a1.indexOf(30));
		
		
	}
	
	
}
