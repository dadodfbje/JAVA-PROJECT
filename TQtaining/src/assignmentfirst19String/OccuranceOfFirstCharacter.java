package assignmentfirst19String;

import java.util.Scanner;

public class OccuranceOfFirstCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
             String s=sc.next();
             int j;
             char ch[]=s.toCharArray();
             for(int i=0;i<ch.length;i++)
             {
            	 int count=1;
            	 for(j=i+1;j<ch.length;j++)
            	 {
            		 if(ch[i]==ch[j])
            		 {
            			 count=count+1;
            			 ch[j]=0;
            		 }
            	 }
            	 if(ch[i]!=0)
            	 {
            		 System.out.println(ch[i]+"------>"+count);
            	 }
             }
	}

}
