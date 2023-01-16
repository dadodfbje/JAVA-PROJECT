package assignment14Jan;

import java.util.Scanner;

public class Solve {
	
	static int []arr=new int [10];
	Scanner sc=new Scanner(System.in);
	public int[] shell(int [] arr)
	{
		
		
       
        	//{5,4,12,8,9,10,43,7,3,1 };
        	
       
       int sum=0;
       int j;
      int i;

        for(i=0;i<arr.length;i++)
        {    
        	
        	arr[i]=sc.nextInt();
        }
        for(i=0;i<arr.length;i++)
        {
			for( j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
				    int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}

			
		}
		
		for(int t=0;t<arr.length-2;t++)
		sum=sum+arr[t];
		System.out.println(sum);
		return arr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Solve all=new Solve();
      all.shell(arr);
	}

}
