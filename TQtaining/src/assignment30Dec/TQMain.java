package assignment30Dec;

import java.util.Scanner;

public class TQMain {
	
	public static void busTicketgetTicketDetails()
	{   
		
		Scanner sc=new Scanner(System.in);
		Person na=new Person();
	  
	 
		
		System.out.println("Enter the Passenger Name");
		na.setName(sc.next());  
		BusTicket2 ti=new BusTicket2();
		ti. calculateTotal();
		System.out.println("Enter the Ticket No");
		ti.setTicketNo(sc.nextInt());

		
	
		System.out.println("Ticket No :"+ti.getTicketNo());
		System.out.println("Passenger Name :"+na.getName());
		 System.out.println("Price of a Ticket :"+ti.getA());
			System.out.println("Total Amount :"+ti.getB());
		
		
	}
	public static void main(String[] args) {
		
		//TQMain.
		busTicketgetTicketDetails();
	
		
		
		
           
           
	}

}
