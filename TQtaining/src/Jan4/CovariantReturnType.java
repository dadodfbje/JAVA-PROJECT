package Jan4;

class  Parent
{
	  Parent display()
	  {
		System.out.println(  "parent class method");
		//return new Parent() ;
		return this;
	  }
	  String show()
		{
			return "show method";
		}
	  
	  
}

class Child1 extends Parent
{
	Child1 display()
	  {
		System.out.println(super.display());
		System.out.println(  "child class method");
		return this;
				
	  }
	
	
	
	
}

public class CovariantReturnType {

	public static void main(String[] args) {
		Parent p=new Child1();
		//System.out.println(p.display());
		//Anonymous object
		System.out.println(new Child1().display().show());
		
		/*Object o=p.display();
		Child1 c=(Child1) o;
		c.display().show();*/
		
		
		
		
		

	}

}
