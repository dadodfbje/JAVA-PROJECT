package exceptions;

public class Q3a {

	public static void main(String[] args) {
		int x=10;
		 int y=0;
		 
		try{
		            
		   int i=x/y;
		   int a[]=new int[2];
		   a[3]=12;
		            
		} catch(ArithmeticException e){
		            e.printStackTrace();
		}
	}

}
