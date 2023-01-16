
import java.util.Scanner;

public class DaysOfWeek {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter choice");
	int choice=sc.nextInt();
	
	switch(choice)
	{
	case 1:
	{
		System.out.println("Monday");
		break;//statement in java used to come out of the block loop
	}
	case 2:
	{
		System.out.println("Tuesday");
		break;
	}
	case 3:
	{
		System.out.println("wednesday");
		break;
	}
	case 4:
	{
		System.out.println("Thursday");
		break;
	}
	case 6:
	{
		System.out.println("Saturday");
		break;
	}
	case 5:
	{
		System.out.println("Friday");
		break;
	}
	case 7:
	{
		System.out.println("Sunday");
		break;
	}
	default:
		System.out.println("Invalid choice");
		
		
	}

	}

}



