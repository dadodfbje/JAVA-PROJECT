import java.util.*;
public class CosecutiveNumberMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner to=new Scanner(System.in);
int n=to.nextInt();
int sum=1;
for(int i=1;i<=n;i++)
{
	sum=sum*i;
}
System.out.println(sum);
to.close();
	}

}
