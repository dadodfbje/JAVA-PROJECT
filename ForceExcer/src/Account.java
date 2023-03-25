import java.util.Scanner;



public class Account  {
	String Name;
	int AccNo;
	int balance;
	   
	
	
	 void withdrawll () throws InSufficientBalance
	 {
		 System.out.println("Enter the amount to withdraw");
		 Scanner sc=new Scanner(System.in);
			int withdraw=sc.nextInt();
			if(balance-withdraw<0) 
			{
				throw new InSufficientBalance("Insufficent balance");
			}
			else
				balance=balance-withdraw;
			System.out.println(balance);
			
	 }
       void deposit () 
   	{
   		System.out.println("Enter the amount to deposit");
   		 Scanner sc=new Scanner(System.in);
   		int dep=sc.nextInt();
   		
   		
   			balance=balance+dep;   	
   	}
               
               
	public static void main(String[] args) {			
		Account put=new Account();
	   put.deposit();
	   
	   try {
			put.withdrawll();
		} catch (InSufficientBalance e) {
			
			e.printStackTrace();
		}
		
		
			
		
		
		
	}

}
