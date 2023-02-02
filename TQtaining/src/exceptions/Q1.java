package exceptions;

public class Q1 {

	public static void main(String[] args) {
		int  arr[]= {7,8,9,4,5,6,1,2,3};
		for(int i=arr.length;i<=arr.length;i--)
		{  
			try
			{
			System.out.println(arr[i]);
			break;
			}
			catch(Exception e)
			{
			  e.printStackTrace();
			}
		}
		System.out.println("rest");

	}

}
