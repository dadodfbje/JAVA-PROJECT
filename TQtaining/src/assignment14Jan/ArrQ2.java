package assignment14Jan;

import java.util.Arrays;
import java.util.Scanner;

public class ArrQ2 {

	public static void main(String[] args) {
		/*Q2)Write a Java program to interchange the elements 
        of an array with the elements of another array without using 
        the third array.If the array size 
        differs display "Unable to swap size differs".
        If the range is lesser or equal to Zero . Display "Invalid range "
        Assume the maximum size of array is 20*/


	Scanner sc=new Scanner(System.in);
	
	
	    System.out.println("Enter the number of elements in the first array :");
	 	int size1=sc.nextInt();
	 	int arr1[]= new int [size1];
	 	int i=0; 
		System.out.println("Enter the number of elements in the Second array :");
	    int size2=sc.nextInt();
		int arr2[]= new int[size2];
		System.out.println("Enter the elements in the first array");
       for ( i=0;i<arr1.length;i++)
        	
         {   
        	System.out.println("Enter the Element");
        	arr1[i]=sc.nextInt();
         }
       for ( i=0;i<arr1.length;i++)
       {
        	System.out.println("Enter the Elements of 2nd array");
        	arr2[i]=sc.nextInt();
         }	
        	
       int  temp; 
      
       if(arr1.length==arr2.length)
       {
            for( i=0;i<arr1.length;i++)
            {
    	    
         	   temp=arr1[i];
         	   arr1[i]=arr2[i];
         	   arr2[i]=temp;
         	   
    	    }
       }System.out.println("  "+Arrays.toString(arr1));
       System.out.println("  "+Arrays.toString(arr2));	  
    	    
                 
       
    	 
      
         	 
       
      
        
        
        
	}
}
