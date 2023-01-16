package assignment29DecStatic;
//1  static method will access only static variables
//2 static method will acess only static method
public class StaticVariable3 {
	
	int a=10;
	static int b=20;
	//instance block
/*	{
		System.out.println(a);
		System.out.println(b);
		
	}
	//static block
	static {
		System.out.println("static block");
	}*/
	
	void display()
	{
		
		System.out.println(a);
		System.out.println(b);
		non_static();
		
	}
	
	static void show()
	{
		//System.out.println(a);
		System.out.println(b);
		non_static();
	}
	
	
	 static void non_static()
	{    show();
		System.out.println("non static variables");
	}

	public static void main(String[] args) {
		non_static();
		show();
		StaticVariable3 s=new StaticVariable3();
		//s.display();
		StaticVariable3 s1=new StaticVariable3();
	//	s1.display();


	}

}
