package Arrayall;

public class PairOfElementsWithNo {

	public static void main(String[] args) {
		int arr[]= {4,6,5,-10,8,5,20};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==10)
				{
					System.out.println(arr[i]+" + "+arr[j]+" = 10");
				}
			}
		}
	}

}
