import java.util.Scanner;

public class ConsicutiveNumberAddingl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//adding consecutive number
		Scanner sc =new Scanner(System.in);
		int num=sc.nextInt();
		int sum=0;
		for(int i=1;i<=num;i++)
		{
			sum=sum+i;
		}
		System.out.println(sum);
		sc.close();
	}

}
