package Arrayall;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int [] arr= {3,7,5,6,3,9,25,47,67};
      int i=0;
      for(i=0;i<arr.length;i++)
      {     
    	  int flag=0;
    	  for(int j=2;j<arr[i];j++)
    	  {
    		   if( arr[i]%j==0)
                {
	                   flag=1;
	                  // break;
	                
                } 
           }     
    	       if (flag==0)
               {
        	        System.out.println(arr[i]+" is a prime No");
               }
    	  

	 }  

    	   
     
	}
}


