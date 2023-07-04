package collection_linked_list;

import java.util.LinkedList;
import java.util.List;

public class A {
public static void main(String[] args) {
	
	LinkedList x = new LinkedList();  //class upcasting child class object store in parent class
	x.add(10);
	x.add(20);
	System.out.println("add method:"+x);
	//other program is same as array_list
	
	x.add(10);
	x.addFirst(30);  //add first method to add the element at first index
	x.addLast(50);  //add last method to add the element at last  index
	x.add(20);
	x.addLast(60);
	x.add(null); //store null value
	System.out.println("add method:"+x);
	
	
}
}
