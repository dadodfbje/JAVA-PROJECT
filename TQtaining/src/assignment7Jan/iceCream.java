package assignment7Jan;

public interface iceCream 
{   
	public abstract void eat();

}
interface juice 
{
	public abstract void drink();
}
class Mastani implements iceCream,juice{
	@Override
	public void eat()
	{
		System.out.println("Eat IceCream");
	}
	@Override
	public void drink()
	{
		System.out.println("Drink Juice");
	}
}

