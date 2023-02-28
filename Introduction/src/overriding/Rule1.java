package overriding;

class Parent
{
	
	static void show()
	{
		System.out.println("parent class show method");
	}
}

class Child extends Parent
{
	static void show() 
	{    
		// super.show();
		System.out.println("child class show method");
	}
	
	void accept()
	{
		System.out.println("accept");
	}
	
}

public class Rule1 {

	public static void main(String[] args) {
		Parent p= new Child();//upcasting
		Child c=new Child();
		p.show();
	     c.accept();

	}

}
