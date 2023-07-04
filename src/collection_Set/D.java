package collection_Set;

import java.util.HashSet;
import java.util.Set;

public class D {

	
	public static void main(String[] args) {
		Set s = new HashSet();
		s.add(10);
		s.add(20);
		s.add(null);
		s.add(30);
		s.add(null);
		System.out.println(s);
	}
}
