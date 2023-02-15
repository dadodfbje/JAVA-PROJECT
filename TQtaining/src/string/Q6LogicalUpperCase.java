package string;

public class Q6LogicalUpperCase {

	public static void main(String[] args) {
		/*6. Write a Java program to convert uppercase string to lowercase (without 
				using string function)*/
		String s="HELLO JAVA";
      char []ch=s.toCharArray();
      String ch2="";
      for(int i=0;i<ch.length;i++)
      {
    	  if(ch[i]>=65 && ch[i]<=90)
    	  {
    		 ch[i]=(char) ((char) ch[i]+32);
    		 ch2=ch2+ch[i];
    	  }
      }
      System.out.println(ch);

	}

}
