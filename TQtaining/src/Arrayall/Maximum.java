package Arrayall;

public class Maximum {

	public static void main(String[] args) {
		int arr[]= {4,6,5,10,8,5,20};
		int max=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]>max)
			{
				max=arr[i];
			
			}
		}
         System.out.println(max);
	}

}
