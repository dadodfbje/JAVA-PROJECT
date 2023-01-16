package assignment14Jan;

public class ArrQ3 {

	public static void main(String[] args) {
		/*Q3)Sort the first and second half of an array
	    Anjali likes to play mathematical tricky games .
	    She gets n numbers for an array. Help Anjali to write a Java program to 
	    sort the first half of the array in ascending order and 
	    the second half of the array in descending order. 
	   If the size of the array is 0 or lesser then display 
	   the message as "Array size should be greater than 0".*/
		int i=0;
		int j;
		int arr[]= {20,42,36,15,89,61,60,75,44,94};
		
		for( i=0;i<arr.length/2;i++)
		{
			for( j=i+1;j<arr.length/2;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
			}
			System.out.println(i+" "+arr[i]);
		}
		for( i=arr.length/2;i<arr.length;i++)
		{
		
		  for(  j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
			}
		 System.out.println(i+" "+arr[i]);
	   }
	}

}

