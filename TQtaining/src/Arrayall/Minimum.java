package Arrayall;

public class Minimum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,6,5,10,8,5,20};
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			
			if(arr[i]<min)
			{
				min=arr[i];
			
			}
		}
         System.out.println(min);
	}

}
