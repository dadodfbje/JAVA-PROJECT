package string;

public class StrngMtd1ToCharArray {
          
	static void fun(char ch[])
	{
		for(int i=0;i<ch.length;i++)
		{
			 System.out.println(i+"-----"+ch[i]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String s="hello";
           char ch[]=s.toCharArray();
          fun(ch);
	}

}
