package string;

import java.util.Scanner;

public class Xobin1 {
	public static boolean findthree(int num)
	{    
		boolean ispresent=false;
		//7201432,87501,-4573
		
       	  while(num>0)
       	  {
       		  int rem=num%10;
       		  if(rem==3)
       		  {
       			  ispresent=true;
       		  }
       		  num=num/10;
       	  }
      
		 return ispresent;
	}

	public static void main(String[] args) {
		
         Scanner sc=new Scanner(System.in);
         int num=sc.nextInt();
         boolean ispresent=false;
         ispresent=findthree(num);
         System.out.println(ispresent);
	}

}
