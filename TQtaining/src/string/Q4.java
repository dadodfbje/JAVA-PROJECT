package string;

import java.util.Scanner;

public class Q4 {
	/*4. Write a Java program to find second occurrence of a character in a given 
	string.*/

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               Scanner sc=new Scanner(System.in);
               System.out.println("Enter The String");
               String a=sc.nextLine();
               char[]ch=a.toCharArray();
               for(int i=0;i<ch.length;i++)
       		{   			
       			int count= 1;		        
       			for(int j=i+1;j<ch.length;j++)
       			{
       				if(ch[i]==ch[j])
       				{
       				     count++;
       					ch[j]=0;
       				}												
       			}
       			if(ch[i]!=0)
       			{
       			System.out.println(ch[i]+"<--->"+count);
       			}
       		}
              
	}

}
