package dec21Assignment;

import java.util.Scanner;

public class SwitchCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		
		//char choice=sc.next().charAt(0);
		String choice=sc.next();		
		int a=10,b=20;
		
		switch(choice)
		{
			case "add":
				System.out.println("addition is"+(a+b));
				break;
			case "sub":
				System.out.println("subtraction is"+(a-b));
				break;
			case "mul":
				System.out.println("Multiplication is"+(a*b));
				break;
			case "div":
				System.out.println("Division is"+(a/b));
				break;
				default:
					System.out.println("wrong choice");
		}
		

	}

}
