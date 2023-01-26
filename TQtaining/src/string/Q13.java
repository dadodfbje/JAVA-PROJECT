package string;

public class Q13 {
	/*13.Write a program that takes your full name as input and displays the 
	abbreviations of the first and middle names except the last name which is 
	displayed as it is. For example, if your name is Robert Brett Roser, then the 
	output should be R.B.Roser.*/
         
	public static void main(String[] args) {	
		String s="Robert Brett Roser";
	    
	    System.out.println(s.charAt(0));
		for(int i=0;i<s.length();i++)
  	     {   
  		     char ch=s.charAt(i);
  		     if(ch==' ')
  		     {  			     
  			      System.out.println( s.charAt(i+1));
  			      break;
  		     }			  
  	     }   
              
               String []ch1=s.split("\\s");               
               for(int i=0;i<ch1.length;i++)
               {               	   
            	   System.out.println(ch1[i]);
            	   break;
               }
              
               
	}

}
