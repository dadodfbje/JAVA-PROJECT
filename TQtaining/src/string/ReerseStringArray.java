package string;

public class ReerseStringArray {

	public static void main(String[] args) {
		String[]s= {"Anchal","Arya","Neha","Darshan"};
        String b[]=new String[s.length];
	    int i=0;
		   for(int j=s.length-1;j>=0;j--)
		   {
	    	     b[i]=s[j];
	    	    i++;
		   }
	   
	    
	    for(i=0;i<s.length;i++)
	    {
	    	System.out.println(b[i]);
	    }
		
	}

}
