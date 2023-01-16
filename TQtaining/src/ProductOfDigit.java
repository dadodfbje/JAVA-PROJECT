import java.util.Scanner;

public class ProductOfDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number");
		int num=sc.nextInt();
		int rem=1;
		int count=0;
		while(num>0)
		{
		 count=num%10;
		 rem=rem*count;
			
			num=num/10;
		}
		System.out.println(rem);

	}

}
