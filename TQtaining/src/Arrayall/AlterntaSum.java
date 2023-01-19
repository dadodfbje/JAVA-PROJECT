package Arrayall;

public class AlterntaSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int sum=0;
		int arr[]= {1,4,5,2,7,9};
		for(int i=0;i<6-2;i++)
		{
			sum=arr[i]+arr[i+2];
			System.out.println(sum);
		}

	}

}
