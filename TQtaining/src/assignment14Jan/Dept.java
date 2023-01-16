package assignment14Jan;

public class Dept {
	/*Q6)Create class Dept(did, dname), class MyDate(day, month, year)
	a. Class Employee(emp_id, emp_name, salary, date(object),
	dept(object)). Create array of Employee and display the
	array elements*/
	 String did;
	 String dname;
	
	public Dept(String did , String dname)
	{
	     super();
		this.did = did;
		this.dname = dname;
	}
	
	
	
	
	public void setDid(String did)
	{
		this.did=did;
	}
	public String getDid()
	{
		return did;
	}
	public void setDname(String dname)
	{
		this.dname=dname;
	}
	public String getDidname()
	{
		return dname;
	}
	@Override
	public String toString() {
		return "Dept [did=" + did + ", dname=" + dname + "]";
	}
	
	
	

}
