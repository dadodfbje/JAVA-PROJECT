package assignmentArraylist4feb;

import java.util.ArrayList;

public class Q13 {
	//13.	WAP to empty ArrayList
	public static void main(String[] args) {
		ArrayList<String> colourBox=new ArrayList<String>();
		colourBox.add("Green");
		colourBox.add("Yellow");
		colourBox.add("blue");
		colourBox.removeAll(colourBox);
		System.out.println(colourBox.isEmpty());

	}

}
