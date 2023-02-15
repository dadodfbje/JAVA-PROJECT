package assignmentArraylist4feb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q18 {
	//18.	WAP to add 1 to 50 numbers in ArrayList and print only even numbers (using iterator)
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
	
			ArrayList<Integer> fis=new ArrayList<Integer>(50);
		    while(sc.hasNextInt())
		    {   
		    	System.out.println("Enter the Number");
		    	fis.add(sc.nextInt());
		    }  
		  
		      for(int a:fis)
		      {
		    	  if(a%2==0)
		    	  {
		    		  System.out.println(a);
		    	  }
		      }  

	}

}
