package string;

public class CharToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            char[] ch= {'a','b','c','d'};
            String s=new String(ch);
            System.out.println(s);
            for(int i=0;i<ch.length;i++)
            {
            	System.out.println((char)((char) ch[i]-32));
            }
            
	}

}
