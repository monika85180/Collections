package collection_Set;

import java.util.LinkedHashSet;

//LinkedHasSet
public class B {
	
	public static void main(String[] args) {
		LinkedHashSet<Integer> x = new LinkedHashSet<Integer>(); ///Its maintain insertion order and works on unique value
		x.add(10);
		x.add(20);
		x.add(30);
		x.add(40);
		x.add(40);
		x.add(null); 
		System.out.println(x);
	}

}
