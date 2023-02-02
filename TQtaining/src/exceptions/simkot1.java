package exceptions;

public class simkot1 {

	public static void main(String[] args) {
		InvalidRange got=new InvalidRange();
		try {
			got.check(9999999);
		} catch (InvalidRange e) {
			
			System.out.println("No is out of Range");
		}
	}

}
