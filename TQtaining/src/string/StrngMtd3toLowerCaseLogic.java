package string;

public class StrngMtd3toLowerCaseLogic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            String s="HELLO WORLD";
            char ch[]=s.toCharArray();
            for(int i=0;i<ch.length;i++)
            {
            	ch[i]=(char) (ch[i]+32);
            }
            String d1=new String(ch);
            System.out.println(d1);
	}

}
