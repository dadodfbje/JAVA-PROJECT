package map;

import java.util.HashMap;
import java.util.Map;

public class Q2 {
	/*2. WAP add elements to HashMap without using generics, 0th location use String as key and
	Integer as value, on 1st location use String as key String and Integer as value.*/
	public static void main(String[] args) {
		 Map excer= new HashMap();
			
			excer.put("Darshan",65);
			excer.put(85,"Surya");
			excer.put("K",73.86f);
			excer.put("Bhishma",94);
			excer.put("Arjuna",16);
			excer.put("Kartikya",37);
			
			System.out.println(excer);

	}

}
