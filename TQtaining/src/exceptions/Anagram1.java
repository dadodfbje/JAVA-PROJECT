package exceptions;

import java.util.Scanner;

public class Anagram1 {
          public static boolean check(String s,String s1) {
        	  boolean isAnagram = false;
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
              	  }
                }                
                if(flag==1 && count==ch.length)
    			{
    				isAnagram = true;
    			}
    			else {
    			    isAnagram = false;
    			}
                return isAnagram;
          }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		    String s=sc.next();
		    System.out.println("Enter the String");
		    String s1=sc.next();
		    Anagram1.check(s, s1);
		    boolean b2=Anagram1.check(s, s1);
		    System.out.println(b2);
	}

}
