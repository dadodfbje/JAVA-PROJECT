package string;

import java.util.Arrays;

public class Xobin2 {

	public static void main(String[] args) {
		
               String arr= "india is my country";
               String arr2= "India is best country";                                 
               String[] a=arr.split("\\s");              
               System.out.println(Arrays.toString(a));
               String []b=arr2.split("\\s");
               
               System.out.println(Arrays.toString(b));
               for(int i=0;i<a.length;i++)
               {
            	   if(a[i].equals(b[i].toLowerCase()))
            	   {
            		  System.out.println(a[i]); 
            	   }
               }
	}

}
