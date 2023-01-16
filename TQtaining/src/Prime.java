import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
	
	
	  for(int i=300;i<=400;i++)
      {
   	        int flag=0;
          
		    for(int j=2;j<i;j++)
		    {
			
			      if(i%j==0)
			        {
				      flag=1;
			        }
			
		    }
		
		    if(flag==0)
		     {
			        System.out.println(i+ " is prime");
		     }	

	 }
		
	
	
	}

	}
