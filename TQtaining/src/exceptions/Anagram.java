package exceptions;

import java.util.Scanner;

public class Anagram {
	

		public static boolean checkAnagram(String first, String second)
		{
			boolean isAnagram = false;
			String first1=first;
			String second2=second;
			
			first1=first1.toLowerCase();
			second2=second2.toLowerCase();
			
			char[]ch1=first1.toCharArray();
			char[]ch2=second2.toCharArray();
			
			for(int i=0;i<ch1.length;i++)
			{
				for(int j=0;j<ch1.length;j++)
				{
					if(ch1[i] > ch1[j])
					{
						char temp=ch1[i];
						ch1[i]=ch1[j];
						ch1[j]=temp;
					}
					if(ch2[i] > ch2[j])
					{
						char temp=ch2[i];
						ch2[i]=ch2[j];
						ch2[j]=temp;
					}
				}
			}
			
			
			
			int count=0;
			int flag=0;
			for(int i=0;i<ch1.length;i++)
			{
				if(ch1[i]==ch2[i])
				{
					count++;
					flag=1;
				}
			}
			
			if(flag==1 && count==ch2.length)
			{
				isAnagram = true;
			}
			else
			    isAnagram = false;
			
			return isAnagram;
			
		}
		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
		
			String first=in.next();
		
			String second=in.next();
			
			Anagram.checkAnagram(first, second);
		    boolean b2=Anagram.checkAnagram(first, second);
		    System.out.println(b2);
}
	}
