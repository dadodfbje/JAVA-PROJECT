package assignment30Dec;



public class Employee {
	
	int id;
	String name;
	Department d;//has a relationship//aggregation
	
	
	Employee(int id,String name,Department d)
	{
		this.id=id;
		this.name=name;
		this.d=d;
	}
	
	
	@Override
	public String toString() {
		return     id+" "+ name + " " +" "+ d ;
	}


	public static void main(String []a)
	
	{
		Department d=new Department("HR","Mumbai");//0x200
		Employee e=new Employee(1,"pooja",d);
		
		
		System.out.println(e);
				
		
	}

	

}
