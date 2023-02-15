package map;

public class Q10d {
	// 10.remove common elements from two arrays
	public static void main(String[] args) {
		 int[] arr1={12,2,3,41,5};
	      int[] arr2={13,25,3,11,7};
	   
     
	      
	   
	      for (int i = 0; i < arr1.length; i++)
	      {
	         int flag=0;
	         for (int j = 0; j < arr2.length; j++)
	         {
	            if (arr1[i]==arr2[j])
	            {
	               flag=1;
	               break;
	            }
	         }
	         if(flag==0)
	         {
	            System.out.print(arr1[i]+" ");
	         }
	      }
	      System.out.println();
	     
	      for (int i = 0; i < arr2.length; i++)
	      {
	         int flag=0;
	         for (int j = 0; j < arr1.length; j++)
	         {
	            if (arr2[i]==arr1[j])
	            {
	               flag=1;
	               break;
	            }
	         }
	         if(flag==0)
	         {
	            System.out.print(arr2[i]+" ");
	         }

	}

}
}
