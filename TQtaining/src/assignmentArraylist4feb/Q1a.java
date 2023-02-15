package assignmentArraylist4feb;

import java.util.ArrayList;
import java.util.Iterator;

public class Q1a {
	/*1.	WAP to add elements to arraylist without using generics (no <>) and
	print content of it where Integer is used. In second arraylist String is used.*/
	public static void main(String[] args) {
		ArrayList fis=new ArrayList();
		fis.add(45);
		fis.add(79);
		fis.add(82);
		fis.add(77);
		for(int i=0;i<fis.size();i++)
		{
			int a= (int)fis.get(i);
	      	System.out.println(a);
		}
		
		
		
		
	
		

	}

}
