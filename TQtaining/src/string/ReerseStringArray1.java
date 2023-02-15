package string;

public class ReerseStringArray1 {

	public static void main(String[] args) {
		
		String[]s= {"Anchal","Arya","Neha","Darshan"};		
		 for(int i=0;i<s.length/2;i++)
		 {
			        String  temp=s[i];
					s[i]=s[s.length-1-i];					
					s[s.length-1-i]=temp;			        							      		       
		 }
		 for(String a:s)
			 {
			    System.out.println(a);
			 }

}
 }