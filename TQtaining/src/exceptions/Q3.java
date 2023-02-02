package exceptions;

import java.util.Scanner;

public class Q3 {
	//3. WAP to catch multiple exceptions. i.e ArrayIndexOutOfBoundsException and ArithmeticException
	public void multiple (int [] arr,int b)
	{        
		
		
		 
			try {
				
			    System.out.println(arr[7]/b);
			    System.out.println(arr[1]/b);
		
			}
			catch(ArithmeticException e)
			{
				System.out.println("You are dividing by zero");
				
			}
			catch(Exception e)
			{
				System.out.println("Printing beyond the length"); 
			}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Q3 go=new Q3();
		 int [] arr= {1,2,3,0,4,0,5};
		go.multiple(arr, 0);

	}

}
