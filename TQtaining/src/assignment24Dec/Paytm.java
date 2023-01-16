package assignment24Dec;

import java.util.Scanner;

public class Paytm {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		
	
             User u1=new User("ram","pune",3232,450);
        	 
        	u1.print();
        	System.out.println("Enter coupn code");
    		String s=sc.next();
        	 int p=u1.getPrice();
        	 
        	 if(s.equals("gold"))//equals method will check the characters
        	 {
        		 p=p-50;
        		 System.out.println("price after discount..."+p);
        	 }
        	 
        	 else if(s.equals("silver"))
        	 {
        		 p=p-30;
        		 System.out.println("price after discount.."+p);
        	 }
        	 else
        		 System.out.println("price is.."+p);
        	 
        	
        	 
         }
}
