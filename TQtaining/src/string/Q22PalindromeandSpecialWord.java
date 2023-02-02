package string;

import java.util.Scanner;

public class Q22PalindromeandSpecialWord {
	/*22.Special words are those words which start and end with the same letter.
	Examples - EXISTENCE, COMIC, WINDOW. Palindrome words are those 
	words which read the same from left to right and vice-versa. Examples -
	MALAYALAM, MADAM, LEVEL, ROTATOR,
	CIVIC. All palindromes are special words, but all special words are not
	Palindromes. Write a program to accept a word, check and print whether 
	the word is a Palindrome or only special*/
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		String str="";int i=0;
		int j=s.length();

		for(i=s.length()-1;i>=0;i--)
		{
			str=str+s.toLowerCase().charAt(i);			
		}
		
		if(s.toLowerCase().equals(str))   
		{
			System.out.println(s+" <---- is Palindrome and also a Special word");
		}
		else if( s.toLowerCase().charAt(0)==s.toLowerCase().charAt(j-1)  && s.toLowerCase()!=str)
		{
			System.out.println(s+" <---- is a Special Word and Not a palindrome");
		}
		else if( s.toLowerCase().charAt(0)!=s.toLowerCase().charAt(j-1))
		{
			System.out.println(s+" <----- is not a Special Word");
		}
		
		
	}
}
