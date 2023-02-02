package string;

import java.util.Scanner;
              //5. Write a Java program to count occurrences of a word in a given string
public class Q5LogicalLowerCase {
  int count=0;
	public static void main(String[] args) {
		
		
         String a="india is my country and India is best india is country";
          String []ch=a.toLowerCase().split("\\s");
          
         for(int i=0;i<ch.length;i++)
 		{   	
 			int count= 1;		        
 			for(int j=i+1;j<ch.length;j++)
 			{
 				if(ch[i].endsWith(ch[j]))
 				{									
 					count++; 				
 					ch[j]="0";					
 				} 				
 			}	
 				if(ch[i]!="0")
 			     {
 			          System.out.println(ch[i]+"<--->"+count);
 			     }
 		}		
 				
 								
 						
 				
 			
 			
 		
 		}
       
       
	}


