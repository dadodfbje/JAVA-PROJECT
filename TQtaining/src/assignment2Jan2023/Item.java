package assignment2Jan2023;

public class Item {
	private String i_name;
	private int price;
	
	public void setI_name(String i_name)
	{
		this.i_name=i_name;
		
		
	}
	
	public String getI_name()
	{
		return i_name;
	}
	
	public void setPrice(int price)
	{
		this.price=price;
		
		
	}
	
	public int getPrice()
	{
		return price;
	}

	@Override
	public String toString() {
		return  i_name + " " + price ;
	}
	
	
	

}
