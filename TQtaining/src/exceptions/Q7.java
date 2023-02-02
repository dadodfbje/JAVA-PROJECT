package exceptions;

public class Q7 {
	/*7.WAP to show the scenario in which number-format exception is generated and handle this
	exception.*/
	public static void main(String[] args) {
		String a="1.0";
		
		try
		{
		System.out.println( Integer. parseInt("1.0"));
		}catch(NumberFormatException e)
		{
			System.out.println("Cannot convert String to int");
		}

	}

}
