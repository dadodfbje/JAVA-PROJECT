package string;

public class StringReverse {
	//11.Write a Java program to find reverse of a string(using function).
	public static void main(String[] args) {
		String str="How to use a Reverse Function";
		String  a="";
        char ch;                           
       for (int i=0; i<str.length(); i++)
      {
        ch= str.charAt(i);     
        a= ch+a; 
        
      }
       System.out.println("Reversed word: ("+ a+")");

	}

}
