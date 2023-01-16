import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int OTPC=8889;
		Scanner sc=new Scanner(System.in);
	    int choice=0;
	    do
		{
		System.out.println(" 1   Rest Your Password");
		System.out.println(" 2   Reset Your Name");
		System.out.println(" 3   Exit");
		
		System.out.println("Enter Choice");
		choice=sc.nextInt();
		
		switch(choice)
		{
		case 1:
		{
			System.out.println("Reset your Password");
			int OTP=sc.nextInt();
			if(OTP==OTPC)
			{
				System.out.println("Enter New Password");
				int enter=sc.nextInt();
				System.out.println("Your Password Change Successfully");
			}
			else
				
			System.out.println("ONE TIME PASSWORD IS NOT CORRECT");
			
			break;
		}
		case 2:
		{
			System.out.println("Reset your name");
			int name=sc.nextInt();
			System.out.println("YOUR NAME CHANGE SUCCESSFULLY");
			break;
			}
		case 3:
		{
			System.exit(0);
		}
		
		}
		}while(choice!=3);
	}

}
