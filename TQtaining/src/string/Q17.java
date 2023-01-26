package string;

public class Q17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*17. Write a program to find out the largest and smallest length word in the 
		string “This is an umbrella".*/
		String s= "This is an umbrella";
		String []ch=s.split("\\s");
		
		
		for(int i=0;i<ch.length;i++)
		{     String temp=null;
			for(int j=i+1;j<ch.length;j++)
			{
	           if(ch[i].length()<ch[j].length());
	           {
	        	  temp=ch[i];
	        	  ch[i]=ch[j];
	        	  ch[j]=temp;
	           }
			}

			break;
		}
      String big=ch[0];
      String small=ch[ch.length-2];
      System.out.print("Smallest length Word is---> ("+small+") and Largest length Word is ---> ("+big+")");
	}

}
