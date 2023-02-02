package string;

public class Q18bMaxOccurance {
	 static char maxChar(String str) {
	      char ans ='a';
	      int max = 0;
	    
	      int count[] = new int[256];
	      for (int i = 0; i < str.length(); i++) 
	      {
	          count[str.charAt(i)]++;
	         if (count[str.charAt(i)] > max) 
	         {
	            max = count[str.charAt(i)];
	            ans = str.charAt(i);
	          
	         }
	         
	      }
	      return ans;
	   }
	   public static void main(String[] args) {
	      String str = "How do you do";
	      System.out.println("Maximum occurring character is ---> (" + maxChar(str)+")");
	   }
}
