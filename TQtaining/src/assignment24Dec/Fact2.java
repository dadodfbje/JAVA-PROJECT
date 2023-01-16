package assignment24Dec;

import java.util.Scanner;

public class Fact2 {
	void Fact(int num)
	{
		Scanner sc=new Scanner(System.in);
		int sum=0;
		int temp=num;
		
		while(num>0)
		{
			int rem=num%10;
			int fact=1;
			
			for(int i=1;i<=rem;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		
		if(temp==sum)
		{
			System.out.println("krishnamurthy or strong number");
		}
		else
			System.out.println("not krishnamurthy number");

	}

	public static void main(String[] args) {
		 Fact2 f=new Fact2();
		  Scanner sc=new Scanner(System.in);
		  int num=sc.nextInt();
		  f.Fact(num);
	}

}
