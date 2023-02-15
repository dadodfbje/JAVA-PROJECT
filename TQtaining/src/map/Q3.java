package map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q3 {
	/*3. WAP to add elements to a HashMap using generics with Integer as Key and String as value. And
    4 key-value Map.Entry*/
public static void main(String[] args) {
		
		HashMap<Integer, String> bikes=new HashMap<>();
		bikes.put(1, "Yamaha");
		bikes.put(2, "BMW");
		bikes.put(3, "Ducati");
		bikes.put(4, "Honda");
		
		Set <Map.Entry<Integer, String>> ent=bikes.entrySet();
		
		System.out.println(ent);
	}
}
