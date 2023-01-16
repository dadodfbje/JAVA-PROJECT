package assignment2Jan2023;

class Person
{
	String name;
	String c_name;
	Person()
	{
		
	}
	public Person(String name, String c_name) {
		super();
		this.name = name;
		this.c_name = c_name;
	}
	
	
}

class Emp extends Person


{
	String department;
	int salary;
	Emp()
	{
		
	}
	Emp(String name,String c_name,String department,int salary)
	{
		super(name,c_name);
		
		this.department=department;
		this.salary=salary;
	}
	
	public String toString()
	{
		return "name is."+name+"comapny name.."+c_name+" department is.."+department+"salary is.."+salary;	}
	
}

class Emp2 extends Person
{

	public Emp2(String name, String c_name) {
		super(name, c_name);
		// TODO Auto-generated constructor stub
	}
	
}

public class PersonMain {


	public static void main(String[] args) {
		Person p;
		p=new Emp("pooja","HCL","HR",150000);
		p=new Emp2("ram","I.T");
		System.out.println(p);
		
		/*Person p1=new Person("rahul","Mar");
		Emp e3=(Emp) p1;
		System.out.println(e3);*/
		
		Person p1=new Emp("rahul","Hcl","Accounts",18000);
		Emp e3=(Emp) p1;
		System.out.println(e3);
		
		

	}

}
