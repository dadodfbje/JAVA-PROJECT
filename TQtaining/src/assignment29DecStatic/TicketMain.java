package assignment29DecStatic;

import java.util.Scanner;
public class TicketMain {

	public static void main(String[] args) {
		
		   Ticket a=new Ticket();
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter no of Bookings :");
		   int n=sc.nextInt();
		   System.out.println("Enter the avilability of Tickets :");
		  int b=sc.nextInt();
		   a.setAvailableTickets(b);
		   for(int i=1;i<=n;i++)
		   {
			    System.out.println("Enter the Ticketid :");
	          a.setTicketid(sc.nextInt()); 
	          System.out.println("Enter the Price :");
	          int pr=sc.nextInt();
	          a.setPrice(pr);
	          System.out.println("Enter the no of Tickets");
	          int t=sc.nextInt();
	          System.out.println("Available Tickets :"+a.getAvailableTickets());
	          int totalAmount=a.calculateTicketCost(t);
	        		 System.out.println("Total Amount :"+totalAmount);
		       System.out.println("Avilable Tickets after Booking :"+a.getAvailableTickets());
		   }
	         
	         
	         
	          
	}

}
