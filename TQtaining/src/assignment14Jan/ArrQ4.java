package assignment14Jan;

public class ArrQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] arr= {'K','D','A','X','Z','R','L','M'};
		char min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
		}
		System.out.println(min);
	}

}
