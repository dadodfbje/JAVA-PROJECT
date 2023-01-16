package assigment31Dec;

import java.util.Scanner;

public class NationalGame {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String choice=sc.next();
		switch(choice)
		{
		case"India":
			System.out.println("Hockey");
			break;
		case"China":
			System.out.println("TableTennis");
			break;
		case"Bangladesh":
			System.out.println("Kabaddi");
			break;
		case"UnitedStates":
			System.out.println("BaseBall");
			break;
		case"Italy":
			System.out.println("FootBall");
			break;
			default:
				System.out.println("Wrong Input");
		}
	}

}
