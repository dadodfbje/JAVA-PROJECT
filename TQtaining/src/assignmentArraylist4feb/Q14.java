package assignmentArraylist4feb;

import java.util.ArrayList;

public class Q14 {
	//14.	WAP to search an element from ArrayList
	public static void main(String[] args) {
		ArrayList<String> fis=new ArrayList<String>();
		fis.add("Can");
		fis.add("You");
		fis.add("Change");
		fis.add("Shift");
		boolean pre=fis.contains("You");
        if(pre==true)
        {
        	System.out.println("Element is Present");
        }else
        {
        	System.out.println("Element is not Present");
        }

	}

}
