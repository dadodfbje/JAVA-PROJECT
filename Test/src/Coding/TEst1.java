package Coding;

public class TEst1 {

	public static void main(String[] args) {
	//	String num="123456";
		int ch1[]={1,2,5,4,5,6};
		int flag=0;
		int sum=0;
		for(int i=0;i<ch1.length;i++)
		{    
			// sum=sum+ch1[i];
		    for(int j=0;j<ch1.length;j++)
		    {
		    	if(ch1[j]==ch1[i]+1)
		    	{
		    		 
		    		flag=1;
		    		
		    	}
		    	
		    }
		}
		if(flag==1)
		{
			System.out.println("It is in increasing order");
		}else
		{
			System.out.println("Not");
		}

	}

}
