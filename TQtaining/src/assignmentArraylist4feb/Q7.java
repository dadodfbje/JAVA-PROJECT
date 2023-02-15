package assignmentArraylist4feb;

import java.util.ArrayList;

public class Q7 {
	//7.	WAP to create a new ArrayList, add some colors (string) and print the collection.
	public static void main(String[] args) {
		ArrayList<String> fis=new ArrayList<String>();
		fis.add("Voilet");
		fis.add("Indigo");
		fis.add("Red");
		fis.add("blue");
		fis.add("Green");
		for(String a:fis)
		{
			System.out.println(a);
		}

	}

}
