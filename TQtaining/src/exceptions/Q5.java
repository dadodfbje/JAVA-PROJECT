package exceptions;

public class Q5 {
	/*5 WAP to return int value in try block and return int value in finally block and observe which return
			takes precedence*/

		int m1(){
			 try {
			        System.out.println("I am in try block");
			        return 50;
			     }
			   catch(Exception e)
			 {
			  System.out.println("I am in catch block");
			 }
			 finally {
			   return 20;
			 }
		//	 System.out.println("Statement after return"); // Unreachable code.
		//	return 0;
			}
			 public static void main(String[] args) 
			 {
			  Q5 ft = new Q5();
			   System.out.println(ft.m1());
	}

}
