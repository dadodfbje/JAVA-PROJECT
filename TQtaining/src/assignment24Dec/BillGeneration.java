package assignment24Dec;

import java.util.Scanner;

public class BillGeneration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int pizza=sc.nextInt();
		int puffs=sc.nextInt();
		int cooldrink=sc.nextInt();
		
		
		int pizzaprice=100*pizza;
		int puffsprice=20*puffs;
		int cooldrinkprice=10*cooldrink;
		double Total_Amount=pizzaprice+puffsprice+cooldrinkprice; 
		System.out.println(" Bill Details :");
		System.out.println("No of pizzas :"+pizza);
		System.out.println("No of puffs :"+puffs);
		System.out.println("No of cooldrinks :"+cooldrink);
		System.out.println("Total price ="+Total_Amount);
		System.out.println(" ENJOY THE SHOW!!! ");
		
  
	
		

	}

}
