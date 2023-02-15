package assignmentArraylist4feb;

import java.util.ArrayList;

public class Q5 {
	//5.	WAP to iterate through all elements in an ArrayList using for loop
	public static void main(String[] args) {
		ArrayList<Integer> fis=new ArrayList<Integer>();
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
