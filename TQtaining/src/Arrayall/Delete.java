package Arrayall;

public class Delete {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		int pos=2;
		
		
		for(int i=0;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];	System.out.println(arr[i]);
		}
		int size=arr.length-1;
	
		for(int i=0;i<size;i++)
		{
			//System.out.println(arr[i]);
		}

	}

}
