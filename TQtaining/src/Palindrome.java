import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
int temp=num;
int rev=0;
int digit;
while(temp>0)
{
	digit=temp%10;
	rev=rev*10+digit;
	temp=temp/10;
}
if(rev==num)
	System.out.println(num+" is palindrome");
else
System.out.println(num+" not palindrome");
	

	}

}
