package Arrayall;

public class SeparateZeros {

	public static void main(String[] args) {
		int arr[]= {12,0,7,0,8,0,3};
		int temp=0;
		int i=0;
		for(i=0;i<arr.length;i++)
		{   
			for(int j=i+1;j<arr.length;j++)
			{	
			  if(arr[i]==0)
			  {
				     temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
			  }
			}
				System.out.print(arr[i]+" ");
		}
		
		
		
	}

}
