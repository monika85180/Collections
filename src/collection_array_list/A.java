package collection_array_list;

import java.util.ArrayList;
import java.util.Iterator;

// methods: add(); add(index, value); , addAll(index, collection);, remove, get();
public class A {
	
	public static void main(String[] args) {
		ArrayList x = new ArrayList();
		x.add(10); // using add method
		x.add(20);
		x.add(30);
		System.out.println("add method:"+x);
		
		x.add(1, 500); //it add the value at 1 index(index, value)
		System.out.println("add value (index, value)"+x);
		
		ArrayList y = new ArrayList();
		y.add(100);
		y.add(200);
		x.addAll(2,y); //it will add the value of 2nd array at 2 index
		System.out.println("addAll(index, collection)"+x);
		
		x.remove(1); //remove the data from 1 index
		System.out.println("remove data"+x);
		
		if(x.contains(100)) { //check the element exist or not
			System.out.println("yes");
			
		}else {
			System.out.println("no");
		}
		
		 
		System.out.println("get method.."+x.get(2));//get the value of given index
		
		Iterator itr =  x.iterator();
		while(itr.hasNext()) {
			System.out.println("value of x.." +itr.next());
		}
		
	}
}
