package Arrayall;

import java.util.Scanner;

public class Merge {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int k=0;
		  int size1=3;		
		  int arr1[]= {1,2,3};

		  int size2=2;
		  int arr2[]= {4,5};

		  int arr3[]=new int[5];
		  for( k=0;k<size1;k++)
			{
				arr3[k]=arr1[k];
			}
		 for(int m=0,l=k;m<arr2.length && l<arr3.length;m++,l++)
		 {
			 arr3[l]=arr2[m];
		 }
		 for(int i:arr3)
		 {
			 System.out.println(i);
		 }

	}

}
