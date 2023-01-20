package string;

import java.util.Scanner;

public class StrngMtd5EqualsIgnoreCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
                Scanner sc=new Scanner(System.in);
                int balance=1000;
                String str;
                do
                {
                	System.out.println("Enter Amount to be deposited");
                	int amt=sc.nextInt();
                	balance=balance+amt;
                	System.out.println("Do you Want to Continue yes/no");
                	str=sc.next();
                }while(str.equalsIgnoreCase("yes"));
                System.out.println("Balance----"+balance+"Rs");
                
	}

}
