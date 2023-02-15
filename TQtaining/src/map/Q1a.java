package map;

import java.util.*;

public class Q1a {
	/*1. WAP to add elements to a HashMap without using generics (ie do not use &lt;&gt;) and print content
	of it. Use Integer as Key and String as Value. In second HashMap add elements of String type as
	Key and Integer as Value.*/
	public static void main(String[] args) {
		 Map excer= new HashMap();
		
		excer.put(65, "Darshan");
		excer.put(85, "Surya");
		excer.put(73, "Karan");
		excer.put(94, "Bhishma");
		excer.put(16, "Arjuna");
		excer.put(37, "Kartikya");
		
		System.out.println(excer);
		
	}

}
