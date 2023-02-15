package assignmentArraylist4feb;

import java.util.ArrayList;

import java.util.List;

public class Q17 {
	//17.	WAP to insert an element into the ArrayList at the first position
	public static void main(String[] args) {
		List<String> listCities =new  ArrayList <String>();
		
		listCities.add("London");
		listCities.add("Paris");
		listCities.add("New York");
		listCities.add("Washington");
		listCities.add("Tokyo");
		
		listCities.add(0, "YorkShire");
          System.out.println(listCities);
	}

}
