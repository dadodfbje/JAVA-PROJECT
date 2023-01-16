
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=1114623;
int rem,sum=0;
int count=0;

while(num>0)
{rem=num%10;
if(rem%2!=0)
{sum=sum+rem;
}
num=num/10;
	}
System.out.println(sum);

}
}
