package string;

public class Q7 {

	public static void main(String[] args) {
		
		/*7. Write a Java program to trim leading white space characters in a 
		string.(using string function and without using string function)*/
		
		// Leading space=( java)
		// Trailing space=(java )
		String s=" &java is proigramming( ";
		char[]arr=new char[s.length()];
		
		    
	
		 String s1="";
		
		   char	s2=' ';
		
		for(int i=0;i<s.length();i++)
		{ 
			
			if(s.charAt(i)==s2)
			{
				continue;
			}
			else
			{
				arr[i]=s.charAt(i);
			}
			 s1=s1+arr[i];
		}
		System.out.println(s1);
		
		
		
		
		
		
		
		
		
		
		
	}

}
