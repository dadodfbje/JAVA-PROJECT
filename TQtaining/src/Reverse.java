import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		 Scanner sc=new Scanner(System.in);
	        int num=456;
	        		//sc.nextInt();
	        int rev=0;
	        int rem=0;
	        while(num>0)
	        {
	        	rem=num%10;
	            rev=rev*10+rem;
	           num=num/10;
	        }System.out.println(rev);
	        sc.close();
	    }
	}


