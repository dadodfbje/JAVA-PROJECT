package Arrayall;

public class Frequency {

	public static void main(String[] args) {
		
   int arr[] = {1,2,3,1,1,3,4,5,1};
 
   for(int i=0;i<arr.length;i++)
   {
	    int count=1;
	   for(int j=i+1;j<arr.length;j++)
	   {
		   if(arr[i]==arr[j])
			{
				count++;
				arr[j]=0;
			}
		}
	   if(arr[i]!=0)
	   System.out.println(arr[i]+"-------"+count);
		
		
	 }  
   }

}

