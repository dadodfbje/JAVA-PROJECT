package assignmentArraylist4feb;

import java.util.ArrayList;
import java.util.Iterator;

public class Q4 {
	//4.	WAP to print all elements of ArrayList using iterator
	public static void main(String[] args) {
		ArrayList fis=new ArrayList();
		fis.add("Can");
		fis.add("You");
		fis.add("Change");
		fis.add("Shift");
		Iterator il=fis.iterator();
		while(il.hasNext())
		{
			System.out.println(il.next());
		}
	}

}
