package assignment24Dec;

import java.util.Scanner;

public class Account {
	String n;
	int acc;
	int code;
	String br;
	int bal;
	void insert ()
	
	{   
		String name=n;
		int accNo=acc;
		int ifsc=code;
		String branch=br;
		int balance=bal;
		
	}
	
	
	void  display () 
	
	{
		System.out.println("welcome to SBI ATM");
		System.out.println("Welcome "+n);
		System.out.println("Account Number ="+acc);
    	System.out.println("IFSC Code ="+code);
    	System.out.println("Branch ="+br);
    	;
	}
	
	void deposit () 
	{
		System.out.println("Enter the amount to deposit");
		 Scanner sc=new Scanner(System.in);
		int dep=sc.nextInt();
		
		
			bal=bal+dep;
		System.out.println("you have succesfully deposit amount");
		System.out.println("Plz check ypour balance after deposit");
	}
	
	
	 void withdraw ()
	 {
		 System.out.println("Enter the amount to withdraw");
		 Scanner sc=new Scanner(System.in);
			int withdraw=sc.nextInt();
			if(withdraw>bal)
			{
				System.out.println("Insufficent balance");
			}
			else
				bal=bal-withdraw;
			System.out.println("you have succesfullywithdraw amount");
			System.out.println("Plz check ypour balance after withdraw");
	 }
	 
	void check_balance() //to check balance
	{
		System.out.println("Balance ="+bal);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		String choice=sc.next();
		switch(choice)
		{

		case "insert":
			
			break;
		case "display":
			
			break;
		case "deposit":
			
			break;
		case "withdraw":
			break;
			
		case "check_balance":
			System.out.println();
			break;
			default:
			System.out.println("wrong choice");
	}
		}
	}


