package map;

import java.util.Scanner;
                     //11.remove duplicates character from given string
public class Q11 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	      System.out.println("enter the string");
	      String st=sc.nextLine();
	      char ch[]=st.toCharArray();
	      int n=ch.length;
	      st="";
	      for (int i=0;i<n ;i++ )
	      {
	         st=st+ch[i];
	         for (int j=i+1;j<n ;j++ )
	         {
	            if (ch[i]!=' '&&(ch[i]==ch[j]||ch[i]==ch[j]+32||ch[i]==ch[j]-32))
	            {
	               for (int k=j;k<n-1 ;k++ )
	               {
	                  ch[k]=ch[k+1];
	               }
	               n--;
	               j--;
	            }
	         }
	      }
	      System.out.println(st);
	}

}
