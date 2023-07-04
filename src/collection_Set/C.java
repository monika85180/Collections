package collection_Set;

import java.util.TreeSet;

//Tree set : contains unique value and sort the data in assending order
public class C {

	public static void main(String[] args) {
		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(10);
		t.add(50);
		t.add(35);
		t.add(90);
		// its not take the null value
		System.out.println(t);
	}
	
	
}
