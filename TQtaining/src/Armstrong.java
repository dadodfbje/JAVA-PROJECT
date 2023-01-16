import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int temp=in.nextInt();
int num=temp;
int rev=0;
int rem=0;
while(num>0)
{
 rem=num%10;
rev=rev+rem*rem*rem;
num=num/10;}
if(temp==rev )
{System.out.println(temp+" Armstrong");}
else
{
System.out.println(temp+" Not Armstrong");
}
}
}


