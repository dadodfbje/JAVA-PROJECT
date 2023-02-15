package assignmentArraylist4feb;

import java.util.ArrayList;

public class Q9 {
	//9.	WAP to remove all elements from ArrayList
	public static void main(String[] args) {
		ArrayList<String> fis=new ArrayList<String>();
		fis.add("Voilet");
		fis.add("Indigo");
		fis.add("Red");
		fis.add("blue");
		fis.add("Green");
		fis.removeAll(fis);
		System.out.println(fis);


	}

}
