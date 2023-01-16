
public class MockTest {
//1,3,7,15,31,63
	public static void main(String [] args)
	{
	int arr[]= {1,2,3,4,5};
	
	int j;
		for(int i=0;i<arr.length;i++)
		{
			for(j=arr.length-1;j>=0;j--)
			{
				if (arr[i]!=arr[j])
				{
					arr[i]=arr[j];
					
					System.out.println(arr[j]);
				}
			
			}
		}
		 
		
		
		
		
		
	
}
}
