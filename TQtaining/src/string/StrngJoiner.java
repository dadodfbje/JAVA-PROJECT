package string;
import java.util.StringJoiner;
public class StrngJoiner {

	public static void main(String[] args) {
		String s="Window";
		String s1="Number";
		StringJoiner sj=new StringJoiner(" ");
		sj.add(s);
		sj.add(s1);
		String s3=sj.toString();
		char ch[]=s3.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u' )
			{
				int x=ch[i];
				System.out.println(ch[i]+"----->"+x);
			}
			System.out.println();
		}
		

	}

}
