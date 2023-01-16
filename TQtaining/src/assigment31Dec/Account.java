package assigment31Dec;

import java.util.Scanner;

public class Account {
	String n;
	int acc;
	int code;
	String br;
	int bal;
	void insert (String name, int accNo,int ifsc, String branch, int balance)
	
	{   
		String n= name;
		int acc=accNo;
		int code=ifsc;
		String br=branch;
		int bal=balance;
		System.out.println("Name :"+name);
		System.out.println("IFSC Code :  "+accNo);
		System.out.println("Branch : "+branch);
    	System.out.println("Balance :"+balance);
    
		
	}
	
	
	void  display () 
	
	{
		System.out.println("welcome to SBI ATM");
		System.out.println("Welcome "+n);
		System.out.println("Account Number ="+acc);
    	System.out.println("IFSC Code ="+code);
    	System.out.println("Branch ="+br);
    	
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
			Account obj=new Account();
			obj.insert("Sumit",123456,123,"YNR",2000);			
			break;
		case "display":
			
			break;
		case "deposit":
			
			break;
		case "withdraw":
			
		case "check_balance":
			System.out.println();
			break;
			default:
			System.out.println("wrong choice");
	}
		}
	}


