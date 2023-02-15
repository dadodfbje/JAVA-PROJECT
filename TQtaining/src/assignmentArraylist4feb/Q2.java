package assignmentArraylist4feb;

import java.util.ArrayList;

public class Q2 {
	           /*2.	WAP add elements to arraylist without using generics, 0th location keep Integer,
	           1st location String now print each element and display contents.*/
	public static void main(String[] args) {
		ArrayList fis=new ArrayList();
		fis.add(96);
		fis.add("You");
	
		
		
			int a= (int)fis.get(0);
	      	System.out.println(a);
	      	String b=(String)fis.get(1);
	      	System.out.println(b);
		

	}

}
