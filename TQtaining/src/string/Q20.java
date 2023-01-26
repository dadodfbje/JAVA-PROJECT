package string;

import java.util.Scanner;

public class Q20 {
	        /*20.WAP to check if two Strings are anagrams of each other?
			(Two strings are anagrams if they are written using the same exact letters, 
			ignoring Space, punctuation and capitalization. Each letter should have the 
			same count in both Strings E.g. Army and Mary is anagram of each other)*/

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		    String s=sc.next();
		    System.out.println("Enter the String");
		    String s1=sc.next();
		    char[]ch=new char[6];
		    char[]ch1=new char[6];
              for(int i=0;i<s.length();i++)
              {
            	  ch[i]=s.charAt(i);
            	   ch1[i]=s1.charAt(i);
            	  
              }
            
              
              
              for(int i=0;i<ch.length;i++)
              {
            	  if(ch[i]>=65 && ch[i]<=90)
            	  {
            		 ch[i]=  (char)  ((char)ch[i]+32);
            		 ch1[i]=  (char)  ((char)ch1[i]+32);
            	  }
            	
              }
              for(int i=0;i<ch.length;i++)
              {   
            	  for(int j=i+1;j<ch.length;j++)
            	  {
            		  if(ch[i]<ch[j])
            		  {
            			  char temp=ch[i];
            			  ch[i]=ch[j];
            			  ch[j]=temp;
            		  }
            		  if(ch1[i]<ch1[j])
            		  {
            			  char temp=ch1[i];
            			  ch1[i]=ch1[j];
            			  ch1[j]=temp;
            		  }
            	  }
            	  
            	  
              }
              int count=0;
              int flag=0;
              for(int i=0;i<ch.length;i++)
              {
            	  if(ch[i]==ch1[i])
            	  {
            		 count++;
            		 flag=1;
            		// System.out.print(ch[i]);
            		//System.out.print(ch1[i]);
            	  }
              }
              
              if(flag==1 && count==ch.length)
              {
            	  System.out.println("Anagram");
              }
              else
            	  System.out.println("Not Anagram");
              
              
               
	}

}
