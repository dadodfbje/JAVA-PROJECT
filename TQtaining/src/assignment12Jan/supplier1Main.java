package assignment12Jan;

import java.util.Scanner;

public class supplier1Main {

	public static void main(String[] args) {
		//Item i=new Item("charger",700);
		
		Supplier1 s[]=new Supplier1[2];
		Scanner sc=new Scanner(System.in);
		System.out.println("Company supplying items..."+Supplier1.c_name);
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter supplier id..");
			int id=sc.nextInt();
			System.out.println("Enter supplier name");
			String name=sc.next();
			System.out.println("Enter item name");
			String i_name=sc.next();
			System.out.println("Enter item price");
			int price=sc.nextInt();
			
			Item it=new Item(i_name,price);
			s[i]=new Supplier1(id,name,it);
			
			
		}
		
		

	}

}
