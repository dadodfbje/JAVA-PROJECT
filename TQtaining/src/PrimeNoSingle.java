import java.util.Scanner;

public class PrimeNoSingle {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
             int i,m,flag=0;
             System.out.println("Enter the String");
             int n=sc.nextInt();
             m=n/2;
             if(n==1 || n==0)
             {    
            	 flag=1;
            	 System.out.println("not prime");
             }else
             {
            	 for(i=2;i<=m;i++)
            	 {
            		 if(n%i==0)
            		 {
            			 System.out.println("Not prime");
            			 flag=1;
            			 break;
            		 }
            	 }
             }
             if(flag==0)
             {
            	 System.out.println("Prime");
             }
	}

}
