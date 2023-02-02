package string;

import java.util.Scanner;

public class Q4a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
      
        String a="indiasurveyassociation";
        char[]ch=a.toCharArray();
        int first = a.indexOf("i");
        int second = a.indexOf("i", first + 1);     	
    	// System.out.println("Second Occurance of (i) is ---->"+second);					
		
        for(int i=0;i<ch.length;i++)
        {   
        	 int firs =ch[i];
             int  secon= a.indexOf(ch[i], i + 1);   System.out.println("Second Occurance of ("+ch[i]+") is ---->"+secon);	
//             break;
         			
        }	
	}

}
