package assignment30Dec;

import java.util.Scanner;

public class SupplierMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter supplier id");
		int id=sc.nextInt();
		
		System.out.println("Enter supplier name");
		String name=sc.next();
		
		System.out.println("Enter item name");
		String i_name=sc.next();
		
		System.out.println("Enter item price");
		int price=sc.nextInt();
		
		Supplier s=new Supplier();
		s.setS_id(id);
		s.setS_name(name);
		Item i=new Item();
		s.setI(i);//0x200
		s.getI().setI_name(i_name);
		s.getI().setPrice(price);
		
		
		System.out.println("supplier id...."+s.getS_id());
		System.out.println("supplier name...."+s.getS_name());
		System.out.println("item name"+s.getI().getI_name());
		System.out.println("item price is..."+s.getI().getPrice());
		
		
		

	}

}
