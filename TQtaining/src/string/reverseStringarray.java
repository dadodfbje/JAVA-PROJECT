package string;

import java.util.Arrays;

public class reverseStringarray {

	public static void main(String[] args) {
String s="hello";
		
		
		char ch[]=s.toCharArray();							
		s=Arrays.toString(ch);
		System.out.println(s);
		
		for(int i=0;i<ch.length/2;i++)
		{
			char temp=ch[i];
			ch[i]=ch[ch.length-1-i];
			ch[ch.length-1-i]=temp;
		}
            s= Arrays.toString(ch);
            System.out.println(s);

	}

}
