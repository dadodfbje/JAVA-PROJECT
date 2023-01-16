package assignment28Dec;

public class Movie {
	   private String movieName;
	   private String movieCategory;
	   private int ticketCost;
	   
	   public void setMovieName(String x)
	   {
		   movieName=x;
	   }
	   public String getMovieName()
	   {
		   return movieName;
	   }
	   public void setMovieCategory(String c)
	   {
		   movieCategory=c;
	   }
	   public String getMovieCategory()
	   {
		   return movieCategory;
	   }
	   public void setTicketCost(int b)
	   {
		   ticketCost=b;
	   }
	   public int getTicketCost()
	   {
		   return ticketCost;
	   }
	   public int calculateTicketCost(String circle)
	   {
		  
		    if (circle.equals ("Gold") && movieCategory.equals("2D"))
		   return 300;
		   else if (circle.equals ("Gold") && movieCategory.equals("3D"))
		   return 500;
		   else if (circle.equals("Silver") && movieCategory.equals("2D"))
		   return 250;
		   else if (circle.equals("Silver") && movieCategory.equals("3D"))
			   return 450;
		   else
			   return 0;
	   }
}

