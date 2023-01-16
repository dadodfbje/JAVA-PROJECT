package assignment24Dec;

public class Employee{
	
	public String e_name="pooja";
	protected String mob_num="42343243";
	String email_id="pooja@gmail.com";
	private String verification_code="1234";
	
	
	
	public Employee()
	{
		
	}
	

	public Employee(String n, String m, String em, String ve) {
		e_name = n;
		mob_num =m;
		email_id = em;
		verification_code = ve;
	}






	public static void main(String[] args) {
		Employee e=new Employee();
		System.out.println(e.verification_code);

	}

}
