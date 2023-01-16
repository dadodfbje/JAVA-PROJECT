package assignment11janVaragsArrayOfObjets;

import java.util.Scanner;

public class ItemMain   {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Item1 item[]= new Item1[3];
		
		for(int i=0;i<item.length;i++)
		{	
		System.out.println("Enter the ID");
		int id=sc.nextInt();
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter salary");
		int price=sc.nextInt();
		 item[i]=new Item1();
		
		item[i].setId(id);
		item[i].setName(name);
		item[i].setPrice(price);
		}
		for(int i=0;i<item.length;i++)
		{
			System.out.println("ID is"+item[i].getId());
			System.out.println("Name is"+item[i].getId());
			System.out.println("Price is"+item[i].getId());
		}
	}

}
