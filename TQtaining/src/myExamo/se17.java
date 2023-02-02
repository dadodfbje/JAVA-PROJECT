package myExamo;

public class se17 {

	public static void main(String[] args) {
		String s1="abc";
		String s2=new String("abc");
		s2.intern();
		System.out.println(s1==s2);

	}

}
