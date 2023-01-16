package Arrayall;

import java.util.Scanner;

public class Integer3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
    int arr[]=new int [10];
    int flag=0;
    int i=0;
    for(i=0;i<arr.length;i++)
    {   System.out.println("Enter the Number");
    	arr[i]=sc.nextInt();
    	
    }

      int sum;
        System.out.println("Enter any Number");
        sum=sc.nextInt();
        for( i=0;i<arr.length;i++)
        {
    	if (sum==arr[i])
    	{
    		flag=1;
    	}
        }
    if(flag==1)
    {
    System.out.println("Number is already Present");
    }
    else
    	System.out.println("Number is not Present");
	}
}
