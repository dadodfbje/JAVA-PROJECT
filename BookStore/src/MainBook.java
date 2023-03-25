import java.util.Date;
import java.util.Scanner;

public class MainBook {

	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		 BookDetails.show();
  do
   {
			System.out.println("Enter the Branch Number ");
		int choice=sc.nextInt();
	
		
		switch(choice)
		{
		         case 1:
		         {    
		        	
		        	    Books[] bk1=BookDetails.showcivil().getBooks();
		 			    for(int i=0;i<bk1.length;i++)
		 			    {
		 				  System.out.println(bk1[i].getId()+" "+bk1[i].getName());
		 			    }
		 			    System.out.println("Enter book ID you want to select");  
		 			    int book_No=sc.nextInt();
		 			    for(int i=0;i<bk1.length;i++)
		 			    {	
					           if(book_No==bk1[i].getId())
					           { 
					        	           System.out.println("no of copies availabe ----->"+bk1[i].getNo_of_copies()+" for "+bk1[i].getName());
					    	               System.out.println("How many copies you want");
							               int copies=sc.nextInt();
							             
							              
							               Books.calculateAvilability(copies);													   
							               System.out.println("Enter your Name");
							               String name=sc.next();							
							               Date d=new Date();
							               System.out.println(name +" your "+ copies +" books is booked on.."+d);
							               System.out.println("Plese return books within 7 days");					    	
					           }
					           else
					           {
					        	   System.out.println("Please Enter the Right ID");
					        	   break;
					           }
					           
					          
		 			     }
		 			      BookDetails.show();
		 			      break;
		         }         
		       case 2:
		         {
		        	
		        	    Books[] bk1=BookDetails.showElectrical().getBooks();
		        	    for(int i=0;i<bk1.length;i++)
		 			    {
		 				  System.out.println(bk1[i].getId()+" "+bk1[i].getName());
		 			    }
		 			    System.out.println("Enter book ID you want to select");  
		 			    int book_No=sc.nextInt();
		 			    for(int i=0;i<bk1.length;i++)
		 			    {	
					           if(book_No==bk1[i].getId())
					           { 
					        	           System.out.println("no of copies availabe ----->"+bk1[i].getNo_of_copies()+" for "+bk1[i].getName());
					    	               System.out.println("How many copies you want");
							               int copies=sc.nextInt();
							               Books.calculateAvilability(copies);
							
							               for(int j=i;j<bk1.length;i++)
							               {
							                 bk1[j].setNo_of_copies(bk1[j].getNo_of_copies()-copies); 							      
							               }							   
							               System.out.println("Enter your Name");
							               String name=sc.next();							
							               Date d=new Date();
							               System.out.println(name +" your "+ copies +" books is booked on.."+d);
							               System.out.println("Plese return books within 7 days");					    	
					           }     
		 			      }  
		 			      BookDetails.show();
		 			      break;
		         }   
		     case 3 :
		         {
		        	
		        	    Books[] bk1=BookDetails.showComputerScience().getBooks();
		        	    for(int i=0;i<bk1.length;i++)
		 			    {
		 				  System.out.println(bk1[i].getId()+" "+bk1[i].getName());
		 			    }
		 			    System.out.println("Enter book ID you want to select");  
		 			    int book_No=sc.nextInt();
		 			    for(int i=0;i<bk1.length;i++)
		 			    {	
					           if(book_No==bk1[i].getId())
					           { 
					        	           System.out.println("no of copies availabe ----->"+bk1[i].getNo_of_copies()+" for "+bk1[i].getName());
					    	               System.out.println("How many copies you want");
							               int copies=sc.nextInt();
							               Books.calculateAvilability(copies);
							
							               for(int j=i;j<bk1.length;i++)
							               {
							                 bk1[j].setNo_of_copies(bk1[j].getNo_of_copies()-copies); 							      
							               }							   
							               System.out.println("Enter your Name");
							               String name=sc.next();							
							               Date d=new Date();
							               System.out.println(name +" your "+ copies +" books is booked on.."+d);
							               System.out.println("Plese return books within 7 days");					    	
					           }     
		 			      }  
		 			      BookDetails.show();
		 			      break;
		         }
		         default:
		        	 System.out.println("Wrong Input");
	        	
		}	      
	 } while(true); 
 
	}
}

