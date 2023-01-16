package Arrayall;

public class MethodAvg {
	public void Avg(int []arr,int sum,float temp)
	{
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
			temp=sum/10;
		}
		System.out.println(temp);
	}

	public static void main(String[] args) {
		
       int []arr= {1,2,3,4,5,6,7,8,9,10};
       MethodAvg sc=new MethodAvg();
       sc.Avg(arr, 0, 0.0f);
	}

}
