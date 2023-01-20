package string;

import java.util.Scanner;

public class FindCharacter {

	public static void main(String[] args) {
		String s="Java Programming";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Character");
		char ch=sc.next().charAt(0);
		char ch1[]=s.toCharArray();
		int flag=0;
		for(int i=0;i<ch1.length;i++)
		{
			if(ch==ch1[i])
			{
				flag=1;
			}
		}
		if(flag==1)
		{
		System.out.println("Given Number Is Present");
		}
          
	}

}
