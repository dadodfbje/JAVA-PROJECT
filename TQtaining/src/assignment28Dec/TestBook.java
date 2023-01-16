package assignment28Dec;

import java.util.Scanner;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Book sc=new Book();
     Scanner a=new Scanner(System.in);
     System.out.println("Enter the Book Name");
     String na=a.next();
     System.out.println("Enter the Price");
     int pr=a.nextInt();
     System.out.println("Enter the Author Name");
     String au=a.next();
     sc.setBookName(na);
     sc.setBookPrice(pr);
     sc.setAuthorName(au);
     System.out.println("BookName ="+sc.getBookName());
		System.out.println("BookPrice ="+sc.getBookPrice());
		System.out.println("AuhorName ="+sc.getAuthorName());
    
	}

}
