package Booklibrary;


import java.util.Date;
import java.util.Scanner;



public class TestBook {

	public static void main(String[] args) {
		int flag=0;
		Book book[]=new Book[3];
		System.out.println("Branches");
		System.out.println("1.Electrical");
		System.out.println("2 I.T");
		System.out.println("3 Mechanical");
		System.out.println("4  stories");
		
		
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the branch");
		String branch=sc.next();
		Branch b=BookDetails.showElectrical();
		Branch b1=BookDetails.showIT();
		
		BookDetails bd=new BookDetails();
		if(b.getBranch().equals(branch))
		{
			Book[] bk1=b.getB();
			for(int i=0;i<bk1.length;i++)
				System.out.println(bk1[i].getId()+" "+bk1[i].getName()+" "+bk1[i].getPrice());
		}
		
		
		
		if(b1.getBranch().equals(branch))
		{
			
			//bd.display();
			Book book1[]=b1.getB();
			int i;
			for( i=0;i<book1.length;i++)
			{
				System.out.println(book1[i].getId()+" "+book1[i].getName()+" "+book1[i].getPrice());
		}
			System.out.println("Enter book you want to select");
			String book_name=sc.next();
			
			
			for( i=0;i<book1.length;i++)
			{
				if(book1[i].getName().equals(book_name))
				{
					flag=1;
					break;
					//System.out.println("no of copies availabe"+book1[i].getNo_of_copies());
					
					
				}
				
				
				
			}
			//System.out.println(i);
			if(flag==1)
			{
				System.out.println("Checking for avilablity");
			}
			else
			{
				System.out.println("sorry this book is not available");
			}
		
			
			System.out.println("how many copies you want");
			int copies=sc.nextInt();
			
		book1[i].setNo_of_copies(book1[i].getNo_of_copies()-copies);
		//System.out.println(book1[i].getNo_of_copies());
		}
		
		
		System.out.println("enter ur name");
		String name=sc.next();
		
		Date d=new Date();
		System.out.println(name +" ur book is booked on.."+d);
		System.out.println("Plz return book within 7 days");
		
		
		
	
		
		

	}

}
