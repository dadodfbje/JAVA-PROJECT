package string;

import java.util.Scanner;
/*21.Create a User {String username, String password} Ask user to enter 
username and password. Find out username and password entered by user 
is valid or not. Do some validations for password entered by user as follows 
and display appropriate message to user. Validation Message as follows -
a. If password length is less than 8 - password must be 8 chars 
long.
b. If password does not contain # or @ - at least one special @ or 
# character must be present.
c. If password does not contain number 0 – 9 - password must 
contain at least one digit.
d. If password contains space - password must not have space.
e. If password does not contain uppercase char - password must 
have at least one uppercase letter.
f. If user enters password tQ123 - message will be password 
must be 8 chars long. At least one special @ or # character 
must be present*/
public class Q21Password {
     boolean password(String s)
     {   
    	 char ch;
    	 char space=' ';
    	    boolean capital = false;
    	    boolean lowerCse = false;
    	    boolean number = false;
    	    boolean spce=false;
    	    boolean length=false;
    	    for(int i=0;i < s.length();i++) {
    	        ch = s.charAt(i);
    	        if( Character.isDigit(ch)) {
    	            number = true;
    	        }
    	        else if (Character.isUpperCase(ch)) {
    	            capital = true;
    	        } else if (Character.isLowerCase(ch)) {
    	            lowerCse = true;
   	            } else if(s.charAt(i)==space) {
    	       
    	        	spce= true;
    	        }
    	      else if(s.charAt(i)>=8)  {
    	          	    length=true;    	
    	        } //
    	        if(number && capital && lowerCse && spce && length)
    	        {    
    	        	
    	        	 return true;
    	        }
    	           
    	    }
    	    return false;
    	 
     }

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
		 String s="QuntoSh15674";
	     Q21Password show=new Q21Password();
	     System.out.println(show.password(s)) ;
		
		if(show.password(s)==false)
		{
			System.out.println("Entered password does not match the Requirement");
		}else
			System.out.println("Entered password match the Requirement");
		
		
		
		
		
		
		
		
		

	}

}
