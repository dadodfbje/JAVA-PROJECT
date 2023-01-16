package assignment14Jan;
import java.util.Scanner;
public class Xobin2 {

	public static void main(String[] args) {
		
		
		
				Scanner sc=new Scanner(System.in);
		        int [] arr=new int[10];
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

			}
		}

	


