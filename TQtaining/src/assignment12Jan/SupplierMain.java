package assignment12Jan;

import java.util.Scanner;

public class SupplierMain {

	public static void main(String[] args) {
	
		
		
		Supplier s[]=new Supplier[2];//Array of object
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<s.length;i++)
		{
			System.out.println("Enter supplier id..");
			int id=sc.nextInt();
			System.out.println("Enter supplier name..");
			String name=sc.next();
			
			s[i]=new Supplier();
			s[i].setId(id);
			s[i].setName(name);
			
		}
		
		for(Supplier sup:s)
		{
			//System.out.println(sup.getId());
			//System.out.println(sup.getName());
			System.out.println(sup);
		}
		
		
	}

}
