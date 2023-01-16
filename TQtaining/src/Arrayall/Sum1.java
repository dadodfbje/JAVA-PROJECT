package Arrayall;

import java.util.Scanner;

public class Sum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
    int arr[]=new int [10];
    for(int i=0;i<arr.length;i++)
    {   System.out.println("Enter the Number");
    	arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++)
    {
    	System.out.print(" "+arr[i]);
    }
	}

}
