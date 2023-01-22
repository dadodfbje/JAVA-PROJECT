package string;

import java.util.Arrays;

public class Xobin2 {

	public static void main(String[] args) {
		
                 String arr= "india is my country and India is best country";
                                   
                   String[] a=arr.split("\\s");              
              
            
                
                for(int i=0;i<a.length;i++)
               {     
            	   for(int j=i+1;j<a.length;j++)
            	   {
            	   if(a[i].equals(a[j].toLowerCase()))
            	   {
            		  System.out.println(a[i]); 
            	   }
            	   }
               }
	}

}
