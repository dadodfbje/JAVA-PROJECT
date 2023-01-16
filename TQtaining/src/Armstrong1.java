import java.util.Scanner;

public class Armstrong1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int temp=in.nextInt();
int num=temp;
int score=0;
int pass=0;
while(num>0)
{
	score=score%10;
	pass++;
	num=num/10;
}   
num=temp;
//System.out.println(pass);
//System.out.println(num);


int sum=0;
while(num>0)
{
	int rev=1;
	int rem=num%10;
	for (int i=1;i<=pass;i++)
		{
			rev=rev*rem;
		}
	
	num=num/10;
	sum=sum+rev;
}



if(temp==sum )
{System.out.println(temp+" Armstrong");}
else
{
System.out.println(temp+" Not Armstrong");
}
	}

}
