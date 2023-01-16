package Arrayall;

public class SeparateAllNegative {

	public static void main(String[] args) {
		int arr[]= {-4,6,5,-10,8,-5,-20};
		int temp=0;
		int i=0;
		for(i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
			       if(arr[i]+arr[j]>arr[j])
			       {
			    	    temp=arr[i];
						arr[i]=arr[j];
						arr[j]=temp;
						
			       }
			}System.out.print(arr[i]+" ");
		}

	}

}
