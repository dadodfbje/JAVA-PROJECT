package dec21Assignment;

import java.util.Scanner;

public class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	Scanner sc=new Scanner(System.in);
	//	System.out.println("Enter rows");
		int rows=6;
				//sc.nextInt();
		/* for(int i=1;i<=rows;i++)
		 {
			for(int sp=rows-1;sp>=i;sp--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		 }*/
		for(int i=1;i<=rows;i++)
		 {
			for(int sp=rows-1;sp>=i;sp--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			/*for(int k=2;k<=i;k++)
			{
				System.out.print("*");
			}*/
			System.out.println("");
		 }
		/*for(int i=1;i<=5;i++)//rows
		{
			//System.out.print(i);
		//	System.out.print(" ");
			for(int j=1;j<=5 ;j++)//cols
			{
				
				System.out.print(" ");
				
				if(i==1||i==5||j==1||j==5)
				{
					
					System.out.print("*");
					
				}
				
				else
					System.out.print(" ");
			}
			System.out.println();
		}*/
		
	}

}
