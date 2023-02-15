package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Q7 {
//	7. WAP to get only the Values from a HashMap
	public static void main(String[] args) {
		 HashMap <Integer,String>excer= new HashMap<>();
			
			excer.put(65, "Darshan");
			excer.put(16, "Surya");
			excer.put(73, "Karan");
			excer.put(94, "Bhishma");
			excer.put(16, "Arjuna");
			excer.put(37, "Kartikya");
			Collection<String> val=excer.values();
			Iterator<String> it=val.iterator();
			while(it.hasNext())
			{
				String sc=it.next();
				System.out.println(sc);
			}

	}

}
