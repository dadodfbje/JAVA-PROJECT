package assignment24Dec;
import java.util.Scanner;


public class Fact1 {
	
 	void cal(int num)
	{
		int fact=1;
		
		for(int i=1;i<=num;i++)
		{
			 fact=fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
	  Fact1 f=new Fact1();
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter number");
	  int num=sc.nextInt();
	  f.cal(num);
	}



}




	
		

		

		
		
