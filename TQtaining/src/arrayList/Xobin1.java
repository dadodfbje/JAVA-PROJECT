package arrayList;

import java.util.ArrayList;

import java.util.Scanner;

public class Xobin1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> fis=new ArrayList<Integer>();
	    while(sc.hasNextInt())
	    {   
	    	System.out.println("Enter the Number");
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
