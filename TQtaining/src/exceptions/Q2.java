package exceptions;

public class Q2 {
	//2. WAP to use catch / handle the ArrayIndexOutOfBoundsException exception.
	public static void main(String[] args) {
		int  arr[]= {7,8,9,4,5,6,1,2,3};
		for(int i=arr.length;i<=arr.length;i++)
		{  
			try
			{
			System.out.println(arr[i]);
			}
			catch(Exception e)
			{
			  System.out.println("you are printing beyond array length");
			}
		}
		System.out.println("rest");


	}

}
