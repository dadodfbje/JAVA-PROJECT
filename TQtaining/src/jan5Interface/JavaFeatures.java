package jan5Interface;



interface insertDetails
{
	public static final String code="AAA";
	default void show()
	{
		System.out.println("showing properties");
		
	}
	static void staticShow()
	{
		secure();
	}
	private static void secure()
	{
		System.out.println(code);
	}
	void insert();
	
}

class Student implements insertDetails
{
	int id;
	String name;
	char grade;
	
	
	

	public Student(int id, String name, char grade) {
		super();
		this.id = id;
		this.name = name;
		this.grade = grade;
	}




	@Override
	public void insert() {
		System.out.println(id +" "+name+" "+grade);
		
	}
	
}

public class JavaFeatures {

	public static void main(String[] args) {
		Student i=new Student(1,"pooja",'A');
		i.insert();
		i.show();
		insertDetails.staticShow();




	}
}
