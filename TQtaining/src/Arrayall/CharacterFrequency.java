package Arrayall;

public class CharacterFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch[]= {'a','b','a','c','d','b','a'};
		for (int i=0;i<ch.length;i++)
		{
			int count =1;
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
					count++;
					ch[j]='\0';
				}
			}
			if(ch[i]!='\0')
			{
				System.out.println(ch[i]+"------"+count);
			}
		}
	}

}
