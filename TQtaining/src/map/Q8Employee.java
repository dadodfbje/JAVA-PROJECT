package map;
import java.util.*;
public class Q8Employee implements Comparable <Q8Employee>{
	/*
	 * 8 class Employee(id,name,salary) Create and add 4 more Employee objects in
	 * ArrayList. Print ArrayList. Sort ArrayList using Collections.sort(list) based
	 * on name. If name are same then sort on id. Print arrayList.
	 */

	int id;
	String name;
	int salary;
	String state;
	String country;

	Q8Employee(int id, String name, int salary,String state,String country) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.state=state;
		this.country=country;
	}

	

	@Override
	public String toString() {
		return "Q8Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", state=" + state + ", country="
				+ country + "]";
	}



	@Override
	public int compareTo(Q8Employee o) {
		
		return this.name.compareTo(o.name);
	}








	

}
