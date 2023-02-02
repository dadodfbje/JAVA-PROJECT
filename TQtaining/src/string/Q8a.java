package string;

public class Q8a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="india is my country and India is best is india is country";								
			String Str = a.replaceFirst("india", "");      
			System.out.println("Modified String: " + Str);
			Str = Str.replaceFirst("india", "");
			
			System.out.println("Modified String: " + Str);
	}

}
