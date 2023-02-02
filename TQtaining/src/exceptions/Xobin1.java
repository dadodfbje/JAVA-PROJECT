package exceptions;

import java.util.Scanner;

public class Xobin1 {

	public static void main(String args[])
		{    
		   Scanner sc=new Scanner(System.in);
			String str =sc.nextLine();
		    String word = sc.next();		  
		    String a[] = str.split(" ");	 	    
		    int count = 0;
		    int i=0;
		    for (i = 0; i < a.length; i++)
		    {
		  
		          if (word.equals(a[i]))
		          {
		          count++;
		          }
		    }
		   		 		    
		    	 if (count!=0)
		    	 {
		    		 System.out.println(count);
		    		
		    	 }
		    	 else
		    		 System.out.println("0");
		    
		
		 
		
		
			
	
		}
          
	}


