package Arrayall;

public class SumAndProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {4,6,5,10,8,5,20};
		int sum=0;
		int product=1;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			product=product*arr[i];
		}
		System.out.println(sum);
		System.out.println(product);
	}

}
