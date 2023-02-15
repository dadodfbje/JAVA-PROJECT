package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Xobin2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> fis=new ArrayList<Integer>();
		for(int i=0;i<9;i++)
		{    
			System.out.println("Enter the Element");
			fis.add(sc.nextInt());
		}
		for(int a:fis)
	      {
	    	  if(a%3==0)
	    	  {
	    		  System.out.println(a);
	    	  }
	      }
		

	}

}
