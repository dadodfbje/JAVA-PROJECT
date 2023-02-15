package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Q6 {
//	6. WAP to get only the Keys from a HashMap
	public static void main(String[] args) {
		 HashMap <Integer,String>excer= new HashMap<>();
			
			excer.put(65, "Darshan");
			excer.put(16, "Surya");
			excer.put(73, "Karan");
			excer.put(94, "Bhishma");
			excer.put(16, "Arjuna");
			excer.put(37, "Kartikya");
			Set<Integer> set=excer.keySet();
			Iterator<Integer> it=set.iterator();
			while(it.hasNext())
			{
				Integer sc=it.next();
				System.out.println(sc);
			}
			

	}

}
