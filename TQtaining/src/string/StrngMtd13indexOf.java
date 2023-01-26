package string;

public class StrngMtd13indexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="java is programming";
	//	System.out.println(s.indexOf('i'));
		String ch[]=s.split("\\s");
		for(int i=0;i<ch.length;i++)
		{
		    System.out.println(s.indexOf(ch[i], 0));
		}
	}

}
