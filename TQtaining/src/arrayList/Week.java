package arrayList;


import java.util.*;

public class Week {
	/*Create aarraylist of string. Add 7 days to list ( Monday , Sunday etc)
	Remove elements from list for which string length is more than 7*/
	public static void main(String[] args) {
		ArrayList<String> excer=new ArrayList<String>();
		excer.add("Monday");
		excer.add("Tuesday");
		excer.add("Wednesday");
		excer.add("Thrusday");
		excer.add("Friday");
		excer.add("Saturday");
		excer.add("Sunday");
		
		for(int i=0;i<excer.size();i++)
		{
			if(excer.get(i).length()>7)
			{
				excer.remove(i);
				i--;
			}
			
		}
		System.out.println(excer);

	}

}
