package collection_linked_list;

import java.util.LinkedList;

public class D {

	public static void main(String[] args) {
		Employe divya = new Employe("divya","rathod", 101);
		Employe Avni = new Employe("avni", "rathod", 102);
		Employe Aditya = new Employe("Aditya", "Rathod", 103);
		LinkedList<Employe> l = new LinkedList();
		l.add(divya);
		l.add(null);
		l.add(Avni);
		l.add(null);
		l.addFirst(Aditya);
		l.add(null);
		System.out.println(l);
		
//		for(Employe employe : l) {
//			System.out.println(employe.getFirstName());
//			System.out.println(employe.getLastName());
//			System.out.println(employe.getId());
//		}
		
	}
}
