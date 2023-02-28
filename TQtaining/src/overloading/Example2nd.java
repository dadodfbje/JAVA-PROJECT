package overloading;

public class Example2nd {
                
	public static void foo() {
		System.out.println("Test Food() Called");
	}
	public static void foo(int a) {
		System.out.println("Test food (int) Called");
	}
         public static void main(String[] args) {
        	 WECanOverloadStaticMethod.foo();
        	// WECanOverloadStaticMethod.foo();
         }
static class Grocerr{
}

	
}
