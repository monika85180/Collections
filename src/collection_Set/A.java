package collection_Set;

import java.util.HashSet;

public class A {  
public static void main(String[] args) {
	 
	HashSet<Integer> hasSet = new HashSet<Integer>();  //does not maintain insertion order and works on unique value
	hasSet.add(10);
	hasSet.add(20);
	hasSet.add(30);
	hasSet.add(40);
	hasSet.add(40);
	hasSet.add(null); //it store null value but the value should be only one
	System.out.println("value of hasSet: "+hasSet);
	
}
}
