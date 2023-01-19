package Arrayall;

import java.util.Arrays;

public class Sorting1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,15,16,3,2};
		
		for(int i=0;i<arr.length;i++)
		{int flag=0;
			for(int j=2;j<arr[i];j++)
			{
				if(arr[i]%j==0)
				{
					flag=1;
					break;
				}
			}
			if(flag==0)
			{
				System.out.println(arr[i]+" is a prime Number");
			}
			else
				System.out.println(arr[i]+" not a prime");
		}
	}

}
