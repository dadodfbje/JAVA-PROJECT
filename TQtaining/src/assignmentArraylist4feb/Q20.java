package assignmentArraylist4feb;

import java.util.ArrayList;

public class Q20 {
	//20.	WAP to check if collection is empty
	public static void main(String[] args) {
		 ArrayList < Integer > que = new ArrayList < Integer> ();
		  ArrayList < String > emQue = new ArrayList <String > ();

		    que.add(10);
		    que.add(20);
		    que.add(30);
		    que.add(40);
		    que.add(50);

		    if (que.isEmpty())
		      System.out.println("The que is empty.");
		    else
		      System.out.println("The que is not empty.");

		    if (emQue.isEmpty())
		      System.out.println("The emQue is empty.");
		    else
		      System.out.println("The emQue is not empty.");

	}

}
