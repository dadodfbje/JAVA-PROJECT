package jan5Interface;

interface first
{
	default void firstM1()
	{
		System.out.println("first interface method");
	}
}
interface second
{
	default void firstM1()
	{
		System.out.println("second interface method");
	}
}

class Simple implements first,second
{

	public  void firstM1()
	{
		first.super.firstM1();
		second.super.firstM1();
		System.out.println("simple method");
		
	}

	 
}

public class Implement {

	public static void main(String[] args) {
	  Simple s=new Simple();
	  s.firstM1();
	}

}

