package assignmentArraylist4feb;

import java.util.ArrayList;

public class Q6 {
	//6.	WAP to iterate through all elements in an ArrayList using for each
	public static void main(String[] args) {
		ArrayList<Integer> fis=new ArrayList<Integer>();
		fis.add(45);
		fis.add(79);
		fis.add(82);
		fis.add(77);
		for(int a:fis)
		{
			System.out.println(a);
		}

	}

}
