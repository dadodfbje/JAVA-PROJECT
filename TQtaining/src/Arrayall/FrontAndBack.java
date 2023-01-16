package Arrayall;

public class FrontAndBack {

	public static void main(String[] args) {
		int arr[]= {2,3,15,16,3,2};
		int flag=0;
		int count=0;
		for(int i=0,j=arr.length-1;i<arr.length/2;i++,j--)
		{
			
			
				if(arr[i]==arr[j])
				{    
					System.out.println("Equal");

				}
				else
					System.out.println("Not Equal");
			
		}


	}

}
