package map;

import java.util.HashMap;
/*4. WAP to create a map using Wrapper class as key and value same as keys’ data type WAP to
count the number of key-value (size) mappings in a map.*/
public class Q4a {
public static void main(String[] args) {
		
		int count=0;
		HashMap<String, String> choice=new HashMap<>();
		choice.put("1st", "Yamaha_Ninja_2500");
		choice.put("2nd", "Yamaha_Ninja_350");
		choice.put("3rd", "Honda_CBR_900");
		
		System.out.println(choice);
		
		// 1. Find Size using method.
		
//		int size=choice.size();
//		System.out.println("No. Of Entry's In HashMap : "+size);
		
		// Find Size Without Using Logic.
		for(int i=0;i<choice.size();i++)
		{
			if(!choice.isEmpty())
			{
				count++;
			}
		}
		System.out.println("No. Of Entry's In HashMap : "+count);
	}
}
