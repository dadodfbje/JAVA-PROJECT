package map;

import java.util.*;
import java.util.Map.Entry;

public class Percentage {

	public static void main(String[] args) {
		int pass = 40;
		String result;
		HashMap<String, Integer> excer = new HashMap<>();
		HashMap<String, String> excer1 = new HashMap<>();
		excer.put("Darshan", 67);
		excer.put("Karan", 89);
		excer.put("Bhishma", 77);
		excer.put("Atjun", 28);
		excer.put("Maxy", 37);
		excer.put("Dallas", 63);
		excer.put("Billy", 46);
		    Set<Entry<String, Integer>> it = excer.entrySet();
	     	for (Map.Entry<String, Integer> set1 : it) {
			String s = set1.getKey();
			Integer m = set1.getValue();
			if (m > pass) {
				result = "Pass";

			} else {
				result = "Fail";
			}
			excer1.put(s, result);
		}
		Set<Entry<String, String>> it1 = excer1.entrySet();
		for (Map.Entry<String, String> set1 : it1) {
			String s = set1.getKey();
			String m = set1.getValue();
			System.out.println(s + " " + m);
		}

	}

}
