package string;

public class Q18aOccranceOfall {

	public static void main(String[] args) {
		/* 18.Input a string of alphabets. Find out the number of occurrence of all 
		alphabets in that string. Find out the alphabet with maximum occurrence*/
		String s1="alphabets";
		char[]ch=s1.toCharArray();
		
		
		for(int i=0;i<ch.length;i++)
		{   			
			int count= 1;		        
			for(int j=i+1;j<ch.length;j++)
			{
				if(ch[i]==ch[j])
				{
				     count++;
					ch[j]=0;
				}												
			}
			if(ch[i]!=0)
			{
			System.out.println(ch[i]+"<--->"+count);
			}
		}
		  
	
}

}
