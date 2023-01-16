package assignment24Dec;

public class User {
	
	String name;
	String location;
	int t_id;
	int price;
	
	User(String n,String l,int t, int p)
	{
		name=n;
		location=l;
		t_id=t;
		price=p;
	}
	
	void print()
	{
		System.out.println("name is.."+name);
		System.out.println("location is.."+location);
		System.out.println("ticket id..."+t_id);
		System.out.println("price.."+price);
	}
	
	int getPrice()
	{
		return price;//it return the value where ur method is called
	}

	
}
