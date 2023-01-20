package string;

public class toggleCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             String s="heLlO jAvA";
             char ch[]=s.toCharArray();
             for(int i=0;i<ch.length;i++)
             {
            	 if(ch[i]>=65 && ch[i]<=90)
            	 {    
            		 ch[i]=(char) (ch[i]+32);
            		System.out.print(ch[i]);
            	 } 
            	 else if(ch[i]>=97 && ch[i]<=122)
            	 {    
            		 ch[i]=(char) (ch[i]-32);
            		 System.out.print(ch[i]);
            	 } 
            	 else if(ch[i]==' ')
            	 {
            		 System.out.print(" ");
            	 }
            	 
             }
	}

}
