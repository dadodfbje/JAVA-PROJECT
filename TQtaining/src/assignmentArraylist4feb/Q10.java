package assignmentArraylist4feb;

import java.util.ArrayList;

public class Q10 {
	//10.	WAP to retain all elements from ArrayList
	public static void main(String[] args) {
		ArrayList<String> rainbow=new ArrayList<String>();
		rainbow.add("Voilet");
		rainbow.add("Indigo");
		rainbow.add("Red");
		rainbow.add("blue");
		rainbow.add("Green");
		
	

		ArrayList<String> colourBox=new ArrayList<String>();
		colourBox.add("Green");
		colourBox.add("Yellow");
		colourBox.add("blue");
		colourBox.add("Black");
		colourBox.add("Orange");
		colourBox.add("Brown");
		colourBox.add("Whie");
		
		
		rainbow.retainAll(colourBox);
		System.out.println(rainbow);
		System.out.println(colourBox);
	}

}
