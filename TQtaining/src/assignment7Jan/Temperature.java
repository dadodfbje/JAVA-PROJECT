package assignment7Jan;

import java.util.Scanner;

public class Temperature {
public static void main(String args[] ) {
	Scanner sc=new Scanner(System.in);
	int avg=0;
	int sum=0;
	System.out.println("Enter the Array Size");
	int size=sc.nextInt();
    int arr [] = new int [size];

  
  for(int i=0;i<arr.length;i++)
  {  System.out.println("Enter No");
	sum=arr[i]=sc.nextInt();
		
				
	 avg=avg+sum;
	
  }
  double avgfinal=avg/size;
  System.out.println("Average Temperature is "+avgfinal);

}

}
