package assignment28Dec;

import java.util.Scanner;

public class Movie1 {
	 public static void main(String [] args)
	 {
		 
		 Movie a=new Movie();
	   Scanner sc=new Scanner(System.in);
	
	          
	       
	          Movie m=new Movie ();
	          System.out.println("Enter movie name");
	          String name=sc.next();
	          m.setMovieName(name);
	          System.out.println("Enter category");
	          m.setMovieCategory (sc.next());
	          System.out.println("Enter circle");
	          String circle=sc.next();
	          int price=m.calculateTicketCost (circle); m.setTicketCost (price);
	          System.out.println("movie name is.."+m.getMovieName());
	          System.out.println("movie category is.. "+m.getMovieCategory()); System.out.println("Ticket cost.."+m.getTicketCost ());
	        		
	          }
	   }
//System.out.println("Enter the movie name");
//String name=sc.nextLine();
//System.out.println("Enter the movie category");
//String cat=sc.nextLine();
//System.out.println("Enter the circle:");
//String cir=sc.nextLine();
//// a.calculateTicketCost(cir);
//
//int price=a.calculateTicketCost(cir);
//a.setTicketCost(price);
//       
//      
//       
//		
//       
//	          
//       System.out.println("Movie name :"+a.getMovieName());
//       System.out.println("Movie Category :"+a.getMovieCategory());
//       System.out.println("The ticket cost is :"+a.getTicketCost());
