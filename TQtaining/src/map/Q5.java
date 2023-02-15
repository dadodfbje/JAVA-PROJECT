package map;
import java.util.*;
public class Q5 {
//	5. WAP to get all the entries from a HashMap. Iterate the entries and print the Key &amp; Value values
	public static void main(String[] args) {
		HashMap<Integer, String> players=new HashMap<>();
		players.put(1, "Satyarthi");
		players.put(2, "Dallas");
		players.put(3, "AmsterDam");
		players.put(4, "Menican");
		players.put(5, "Oclahoma");
		
		System.out.println("Iterating HashMap");
		Set<Integer> s=players.keySet();
		Iterator<Integer> it=s.iterator();
		while(it.hasNext())
		{
			Integer i=it.next();
			System.out.println("Key = "+i);
			System.out.println("Values ="+players.get(i));
		}

	}

}
