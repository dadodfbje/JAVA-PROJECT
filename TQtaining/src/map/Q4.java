package map;

import java.util.HashMap;


public class Q4 {
	/*4. WAP to create a map using Wrapper class as key and value same as keys’ data type WAP to
	count the number of key-value (size) mappings in a map.*/
	public static void main(String[] args) {
		 HashMap<String,String>excer= new HashMap<>();
			
			excer.put("Darshan","Darshan");
			excer.put("Surya","Surya");
			excer.put("Karan","Karan");
			excer.put("Bhishma","Bhishma");
			excer.put("Arjuna","Arjuna");
			excer.put("Kartikya","Kartikya");
			System.out.println(excer);
			System.out.println(excer.size());


	}

}
