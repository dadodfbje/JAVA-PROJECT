import java.util.Scanner;

public class SumOfOddNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//int m=n;
		int sum=0;
		for(int i=1;i<=n;i++) {
			if(i%2!=0)
			{sum=sum+i;
			
			}
		}System.out.print(sum+" ");


	}

}

	


