package assignment29DecStatic;

import java.util.Scanner;

public class Ticket {
	private int ticketid;
	private int price;
	private static int availableTickets;
	
	 public void setTicketid(int x)
	   {
		   ticketid=x;
	   }
	   public int getTicketid()
	   {
		   return ticketid;
	   }
	   public void setPrice(int c)
	   {
		   price=c;
	   }
	   public int getPrice()
	   {
		   return price;
	   }
	   public void setAvailableTickets(int b)
	   {
		   availableTickets=b;
	   }
	   public int getAvailableTickets()
	   {
		   return availableTickets;
	   }
	   public int calculateTicketCost(int noOfTickets)
	   {     if(availableTickets>=noOfTickets)
	            {availableTickets=availableTickets-noOfTickets;     
	            return price*noOfTickets; 
	            }
	        else
	        	return -1;
}
}
