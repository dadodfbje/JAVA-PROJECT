package assignment7Jan;

import java.util.Scanner;

public class Ma {
	 static Scanner sc=new Scanner(System.in);
	    public static BusTicket getTicketDetails(){

	  System.out.println("Enter the passenger name:");

      String name=sc.nextLine();
      System.out.println("Enter the gender(M or F / m or f):");

      String c=sc.next();
      System.out.println(" Enter the age:");
      int age=sc.nextInt();
      System.out.println("Enter the ticket no:");
      int ticket=sc.nextInt();
      System.out.println("Enter the ticket price:");
      int ticketPrice=sc.nextInt();

      BusTicket busTicket=new BusTicket(ticket,ticketPrice,new Person(name,c,age));
      busTicket.calculateTotal();
      return busTicket;

}
	    public static void main(String[] args) {

	        BusTicket sample=Ma.getTicketDetails();
	        System.out.println("Ticket no:"+sample.getTicketNo());
	        System.out.println("Passenger Name:"+sample.getPerson().getName());
	        System.out.println("Price of a ticket :"+sample.getTicketPrice());
	        System.out.println("Total Amount : "+sample.getTotalAmount());
	       

}
}
