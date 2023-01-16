package assignment2Jan2023;
class Mobile
{
	String s="welcome to mobile zone";
	String s1="providing processor";
	
	Mobile()
	{
		System.out.println("default constructor");
	}
	
	 void display()
	{
		System.out.println(s);
	}
	
}

class Samsung extends Mobile
{
	String b_name="samsung";
	String s="20 Gb Ram";
	int price=20000;
	String features="20 mega pixcel camera";
	String s1="i5 processor";
	Samsung()
	{
		System.out.println("Samsung default constructor");
	}
	
/*	@Override
	public String toString()
	{
		return "brand is"+b_name+"\n"+"price is"+price+"\n"+"features is"+features;
	}*/
	
	
	void display()
	{
		super.display();
		System.out.println("brand is..."+b_name);
		System.out.println("price is..."+price);
		System.out.println("features is..."+features);
		System.out.println("Ram is......."+s);
		System.out.println(super.s1);
		System.out.println(s1);
	}
	
	
	
	
}
public class MobileMain {

	public static void main(String[] args) {
		Samsung s=new Samsung();//superclass default constructor is called automatically
		s.display();
		//System.out.println(s);

	}

}
