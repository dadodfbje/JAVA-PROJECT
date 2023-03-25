import java.util.Scanner;

public class Prime {
        void check(int a,int sum)
        {
        	while(a>0)
        	{   
        		int flag=0;
        		int num=a%10;
        		int m=num/2;
        		if(num==1 || num==0)
        		{
        			flag=1;
        		}
        
        		for(int i=2;i<=m;i++)
        		{    
        			if(num%i==0)
        			{          				
        			    flag=1;  
        				break;
        			} if(num==1 || num==0)
            		{
            			flag=1;
            		}        	      
        		}
        		if(flag==0)
    			{           			
        			sum=sum+num; 				
    			} 
        		a=a/10;
        	}System.out.println(sum); 
        }
	    public static void main(String[] args) {
	    	Scanner sc=new Scanner(System.in);
	    	System.out.println("Enter the Number");
		int a=sc.nextInt();
		int sum=0;		
		Prime pls=new Prime();
		pls.check(a,sum);
		

	}

}
