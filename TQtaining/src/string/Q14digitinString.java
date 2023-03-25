package string;

import java.util.Scanner;

public class Q14digitinString {
	/*14.Write a program to find average of digits in string.
	E.g. input string is “a5i9gfj4tabc” output: 6*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1 = "a5i9gfj4tabc";
		String s=sc.next();
		char[]ch=s.toCharArray();
		int sum=0;
		int count=0;
		int get;
		for(int i=0;i<ch.length;i++)
		{ 
			if(ch[i]>=  '0'  && ch[i]<= '9')
			{ 
				
				get=Character.getNumericValue(ch[i]);
				 sum=sum+get;				
				 count++;
			}	
			
		}
        //  System.out.println(sum/count);
          System.out.println(sum);
	}

}
