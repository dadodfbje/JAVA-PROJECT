package Arrayall;

import java.util.Scanner;

public class Check4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
   int arr[]=new int [5 ];
                     
   int i=0;
   for( i=0;i<arr.length;i++)
   {   System.out.println("Enter the Nummber");
	   arr[i]=sc.nextInt();
   }
   int count=0;
   int count1=0;
   for( i=0;i<arr.length;i++)
   {
	   if(arr[i]%2==0)
	   {
		   count++;
	   }
//	   else if(arr[i]<0)
//	   {
//		   count1 ++;
//	   }   
	 }	 
	   
   System.out.println(" no of Even No"+count);
   //System.out.println(" no of Negative No"+count);
}
}