package string;



public class Xobin3 {

	public static void main(String[] args) {
		
		 String arr= "india is my country and India is best country";
		 char ch[]=new char[46];
		                    
		 for(int i=0;i<arr.length();i++)
		 {
			 ch[i]=arr.charAt(i);
		 //   System.out.println(ch[i]);	
		 }
		 
		
                    
		  for(int i=0;i<ch.length;i++)
		  {
              if(ch[i]>=65 && ch[i]<=90)
    	      {    
    		       ch[i]=(char) (ch[i]+32);
    		         		    
    	      }
		  }
		
		 String ch1="";
		 for(int i=0;i<ch.length;i++)
		 {
			 ch1=ch1+ch[i]; 
			
		 }  
		     System.out.println(ch1);
           
		     String[] a=ch1.split("\\s");     
		     for(int i=0;i<a.length;i++)
		     {
		    	 System.out.println(a[i]);
		     }
             
	           for(int i=0;i<a.length;i++)
	           {    
	        	   for(int j=i+1;j<a.length;j++)
	        	   {
	        		   if(a[i].equals(a[j]))
	        		   {
	        	          System.out.println(a[i]);
	        		   }  
	        	   }
	           }
             

	}

}
