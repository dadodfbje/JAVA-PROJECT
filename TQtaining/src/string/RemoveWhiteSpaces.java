package string;

import java.util.Scanner;

public class RemoveWhiteSpaces {
         
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		  String ip1="  Solar    power is       one of  the green          Way   ";
		  String ip=sc.nextLine();
		  String a="";
	      char[] ch = ip.toCharArray();
	      char spc=' ';
	     
	      for(int i=0;i<ch.length;i++)
	      {    
	    	  char ch1=ch[i];
	    	  if(!(spc==' ' && ch1==spc))
	    	  {
	    		  a=a+ch1;	    		 
	    	  }
	    	  spc=ch1;
	      }
	      System.out.println(a);
	 
	     
	}

}
