package assignment24Dec;

import java.util.Scanner;

public class SpellCheck {

	
	public static void main(String [] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		
		String m="RAINBOWs";
		
		String word="";
		
		for (int i=0;i<m.length();i++)
		{
			String n=sc.nextLine();
			word=word+n;}
		
		//System.out.println(word);
		
	if(word.equals(m))
	{
		System.out.println(word);
	}
	else
		System.out.println("The spelling is wrong");
	}
	}


