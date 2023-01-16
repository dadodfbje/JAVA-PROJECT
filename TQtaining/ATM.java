

import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		int pin=1234;
		int OTPC=8889;
		Scanner sc=new Scanner(System.in);
	    int choice=0;

	
		do
		{
		
		
		System.out.println(" 1   Rest Your Password");
		System.out.println(" 2   Reset Your Name");
		System.out.println(" 3   Exit");
		
		
		System.out.println("enter choice");
		choice=sc.nextInt();
		
		switch(choice)
		            {
		                  case 1:
		                       {
			                           System.out.println("Reset your Password");
		                             	int OTP=sc.nextInt();
		                            	if(OTP=OTPC)
			                        {
				                       System.out.println("Enter New Password");
				                        int ENTER=sc.nextInt();
			                        }
		                             	else
				                       balance=balance-withdraw;
		                             	System.out.println("ONE TIME PASSWORD IS NOT CORRECT");
			
			                           break;
		                      }
	                      	case 2:
	                         	{
	                         		System.out.println("Reset your name");
			                        int name=sc.nextInt();
			
			
			
				
			                         System.out.println("YOUR NAME CHANGE SUCCESSFULLY");
			
			                          break;
		                          }
		
		
	                    	case 3:
	                         	 {
			                              System.exit(0);
		                         }
		                        
		        }
		}while(choice!=3);//while(true);
	
	
	
	
	

	}

}
