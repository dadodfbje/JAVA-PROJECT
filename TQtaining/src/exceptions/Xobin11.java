package exceptions;

import java.util.Scanner;

public class Xobin11 {
	static int xobin(String str, String word)
	{
	  
	    String a[] = str.split(" ");	 	    
	    int count = 0;
	    for (int i = 0; i < a.length; i++)
	    {
	  
	    if (word.equals(a[i]))
	        count++;
	    }
	 
	    return count;
	}
	 
	
	public static void main(String args[])
	{    
		Scanner sc=new Scanner(System.in);
		String str = "How do you do ";
	    String word = sc.next();
	    System.out.println(xobin(str, word));
	}
	
}
