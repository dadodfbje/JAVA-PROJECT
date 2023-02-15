package assignmentArraylist4feb;

import java.util.ArrayList;

public class Q1b {

	public static void main(String[] args) {
		ArrayList fis=new ArrayList();
		fis.add("Can");
		fis.add("You");
		fis.add("Change");
		fis.add("Shift");
		for(int i=0;i<fis.size();i++)
		{
			String a= (String)fis.get(i);
	      	System.out.println(a);
		}

	}

}
