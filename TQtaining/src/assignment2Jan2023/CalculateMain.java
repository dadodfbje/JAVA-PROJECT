package assignment2Jan2023;

class calcualteA
{
	calcualteA(int a)
	{
		this(12,34);
		System.out.println(a);
	}
	
	calcualteA(int a,int b)
	{
		System.out.println(a+" "+b);
	}
}

class calcualteB extends calcualteA
{
	
	calcualteB()
	{
		super(10);
		
	}
	
	
	
}

public class CalculateMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
