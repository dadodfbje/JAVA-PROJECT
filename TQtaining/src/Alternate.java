
public class Alternate {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5,6};
		for (int i=0;i<arr.length;i++)
		{
			if(arr[i]==arr[i]+1)
			{
				System.out.println(arr[i]);
			}
		}

	}

}
