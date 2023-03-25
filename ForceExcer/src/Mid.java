import java.util.Arrays;

public class Mid {

	public static void main(String[] args) {
	
		      int temp, size;
		      int arr[]= {5,33,24,17,2,8,71};
		      size = arr.length;

		         for(int i = 0; i<size; i++ ){
		         for(int j = i+1; j<size; j++){

		               if(arr[i]>arr[j]){
		               temp = arr[i];
		               arr[i] = arr[j];
		               arr[j] = temp;
		            }
		         }
		      }
		      System.out.println(arr[size-2]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int arr[]= {5,33,24,17,2,8,71};
//		int max=arr[0];
//		  for(int i=0;i<arr.length;i++)
//		  {     
//			  if(arr[i]>max)
//			  {
//				  max=arr[i];
//				  
//			  }
//			  
//		  }
//		for(int i=0;i<arr.length;i++)
//		{   
//			if(max>arr[i])
//			{   
//				max=arr[i];
//				 System.out.println(max);
//			}
//		  
//		}
		
		
		
		
		
		
		
		
		
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int j=i+1;j<arr.length;j++)
//			{
//				if(arr[i]<arr[j])
//				{   
//					int temp=arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//					
//				}
//			}
//			//System.out.println(arr[i+6]);
//		 			
//		}
//	       System.out.println(Arrays.toString(arr));

	}

}
