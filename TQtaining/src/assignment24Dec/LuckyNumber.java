package assignment24Dec;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int sum=0;
while(num>0)
{int rem=num%10;
sum=sum+rem;
num=num/10;
}

if(sum%3==0 || sum%5==0 || sum%7==0)
{
	System.out.println("Lucky Number");
}
else
	System.out.println("Sorry its not my lucky number");
	}

}
