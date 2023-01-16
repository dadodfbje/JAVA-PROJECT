import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Temperature in DegreeCelsius");
		int n=sc.nextInt();
		System.out.println("Temperature in Farenheit ="+(n*1.8+32));

	}

}
