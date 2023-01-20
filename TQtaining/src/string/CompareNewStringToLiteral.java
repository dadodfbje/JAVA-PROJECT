package string;

public class CompareNewStringToLiteral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
             
//            String s="java";
//            String s1="java";
           String s=new String("java");
            String s1=new String("java");
            
           if(s.equals(s1))
           {
        	   System.out.println("Equal");
           }
           else
        	   System.out.println("Not Equal");
	}

}
