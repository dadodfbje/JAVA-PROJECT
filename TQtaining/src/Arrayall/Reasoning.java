package Arrayall;

import java.util.Scanner;

public class Reasoning {

	public static void main(String[] args) {
		
//		    int arr[]=new int [10];
//		    int sum=0;
//            for(int i=0;i<arr.length;i++)
//             {   
//        	   sum=sum*2+1;
//        	   arr[i]=sum;
//        	   System.out.print(arr[i]+" ");
//             }
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=sc.nextInt();
		int sum=0;
				for(int i=0;i<n;i++)
				{
					sum=sum*2+1;
					System.out.println(sum);
				}
	}

}
