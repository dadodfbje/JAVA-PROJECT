//import java.io.InputStream;
import java.util.*;
public class Example {

	
	

	public static void main(String[] args) {
		System.out.println("Enter your name and Age");
		Scanner got =new Scanner(System.in);
		String a=got.next();
		int b=got.nextInt();
		System.out.println("Name: "+a+ " age: "+b);
		got.close();

	}
}
