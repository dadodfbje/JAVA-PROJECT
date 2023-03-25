package com.amit.test;

import java.util.Arrays;
import java.util.Vector;

public class Main {

	static void AlternateRearrange(int arr[], int n)
    {
        // Sort the array
         
        // Collection.sort() sorts the
        // collection in ascending order
        Arrays.sort(arr) ;
         
        Vector v1 = new Vector(); // to insert even values
        Vector v2 = new Vector(); // to insert odd values
     
        for (int i = 0; i < n; i++)
            if (arr[i] % 2 == 0)
                v1.add(arr[i]);
            else
                v2.add(arr[i]);
     
        int index = 0, i = 0, j = 0;
     
        boolean flag = false;
     
        // Set flag to true if first element is even
        if (arr[0] % 2 == 0)
            flag = true;
     
        // Start rearranging array
        while (index < n)
        {
     
            // If first element is even
            if (flag == true)
            {
                arr[index] = (int)v1.get(i);
                i += 1 ;
                index += 1 ;
                flag = !flag;
            }
     
            // Else, first element is Odd
            else
            {
                arr[index] = (int)v2.get(j) ;
                j += 1 ;
                index += 1 ;
                flag = !flag;
            }
        }
     
        // Print the rearranged array
        for (i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
     
    // Driver code
    public static void main(String []args)
    {
        int arr[] = { 47,49,36,98,90 };
        int n = arr.length ;
     
        AlternateRearrange(arr, n);
    }

}
