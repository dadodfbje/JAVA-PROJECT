package Jan4;

class Base
{
	 void display()
	{
		System.out.println("base class display method");
	}
}

class Derived extends Base
{
	
	 void display()
	{
		super.display();
		System.out.println("Derived class display method");
	}
	void show()
	{
		
	}
}

public class BaseMain {

	public static void main(String[] args) {
		Derived d=new Derived();
		d.display();
		d.show();

	}

}
