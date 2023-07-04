package collection_hashMap;

import java.util.HashMap;
import java.util.Map;

public class A {

	public static void main(String[] args) {
		Map<Integer, String> studentInfo = new HashMap<>();
		studentInfo.put(101,"avni");
		studentInfo.put(102,"divyanshi");
		
		System.out.println(studentInfo); //will give (key, value)
		System.out.println(studentInfo.get(101)); // will give value based on key
		System.out.println(studentInfo.values());// will give value
		System.out.println(studentInfo.keySet()); // // will give value
		
		
	}
}
