import java.util.Scanner;

public class Palindrome1 {  
	public static void main(String[] args) {
	 Scanner in = new Scanner(System.in);
	int num =in.nextInt();
	int temp = num; 
	int rev = 0;
	int rem; 
	while (temp > 0)
	{ 
	rem = temp % 10; 
	rev = rev * 10 + rem;
	temp = temp / 10; 
	}
	if (rev == num) 
	{ System.out.println(num + " is palindrome");
	} 
	else
	{ System.out.println(num + " is not a palindrome");
	}
	} 
	}
	
