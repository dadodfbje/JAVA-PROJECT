package string;

public class StrngMtd12getChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is programming";
		char ch[]=new char[7];             
		
		s.getChars(8, 15, ch, 0);
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
	}          

}
