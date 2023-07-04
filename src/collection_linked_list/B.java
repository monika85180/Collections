package collection_linked_list;

import java.util.LinkedList;
 //it works on synchronized manner
public class B {
		
public static void main(String[] args) {
	Employee arun = new Employee("Arun","k",100);
	Employee divya = new Employee("divya", "R", 101);
	Employee Avni = new Employee("avni", "Rathod", 102);
	
	LinkedList<Employee> empdetails = new LinkedList();  // stored the value of employee into linked list
	empdetails.add(arun);
	empdetails.add(divya);
	empdetails.add(Avni);
	
	
	System.out.println(empdetails);
	
	for(Employee employee : empdetails) {  //use of for each
		System.out.println(employee.getFirstName());  //taking the value from getters and setters
		System.out.println(employee.getLastName());
		System.out.println(employee.getId());
	
	}
	
}}
