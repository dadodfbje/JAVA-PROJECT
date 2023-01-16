package Arrayall;

public class Reasoning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    int arr[]=new int [10];
		    int sum=0;
            for(int i=0;i<arr.length;i++)
             {   
        	   sum=sum*2+1;
        	   arr[i]=sum;
        	   System.out.print(arr[i]+" ");
             }
	}

}
