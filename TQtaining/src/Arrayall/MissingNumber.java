package Arrayall;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
         int arr[]= {51,63,11,2};
        for(int i=0;i<4;i++)
        {   
        	for(int j=i+1;j<arr.length;j++)
        	{
        	int re=arr[i]-arr[j];
        	System.out.println(re);
        	break;
        	}
        }
         
	}

}
