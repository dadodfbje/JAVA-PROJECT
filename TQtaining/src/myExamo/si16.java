package myExamo;

public class si16 {

	public static void main(String[] args) {
		String s1="abc";
		String s2=new String ("abc");
		System.out.println(s1==s2);
		System.out.println(s1==s2.intern());

	}

}
