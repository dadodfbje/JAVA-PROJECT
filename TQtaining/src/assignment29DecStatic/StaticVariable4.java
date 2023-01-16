package assignment29DecStatic;

class Static1
{
	static int a=10;
	int b=34;
	
	void display()
	{
		System.out.println(a);
		System.out.println(b);
	}
	
	static void show()
	{
		
		//return "printing values";
		System.out.println("printing values");
		/*Static1 s=new Static1();
		s.display();*/
	}
}
public class StaticVariable4 {

	public static void main(String[] args) {
		
		System.out.println(Static1.a);
		//System.out.println(Static1.show());
		Static1.show();
		float a=3.4f;
		float b=2.3f;
		System.out.println(Math.pow(a,b));
		

	}

}
