import java.util.Scanner;

public class Factorial2 {

	public static void main(String[] args) {
		// Q=5*4*3*2*1
		Scanner sc=new Scanner(System.in);
		
int n=sc.nextInt();
int sum=1;
for(int i=1;n>=i;n--)
{
	sum=sum*n;
}
System.out.println(sum);
sc.close();
	}

}
