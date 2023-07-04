package collection_linked_list;

import java.util.LinkedList;

public class C {

public static void main(String[] args) {
	LinkedList l1 = new LinkedList();
	l1.add(10);
	l1.add(20);
	l1.add(30);
	System.out.println(l1);
	
	
	l1.add(1,50);
	System.out.println(l1);
	
	//adding the data at first
	l1.addFirst(05);
	System.out.println(l1);
	
	//adding the data in last
	l1.addLast(100);
	System.out.println(l1);
}


}
