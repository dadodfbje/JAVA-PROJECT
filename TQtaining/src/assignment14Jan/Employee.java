package assignment14Jan;

import java.util.Scanner;

import Jan4.Person;

public class Employee {
	 int emp_id; 
	 String emp_name; 
	 int salary;
	 Dept dept;
	 MyDate mydate;
	
	
public Employee(int emp_id, String emp_name, int salary, Dept dept, MyDate mydate) {
		super();
		this.emp_id = emp_id;
		this.emp_name = emp_name;
	    this.salary = salary;
		this.dept = dept;
		this.mydate=mydate;
	}


	
	public int getEmp_id() {
	return emp_id;
}



public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}



public String getEmp_name() {
	return emp_name;
}



public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}



public int getSalary() {
	return salary;
}



public void setSalary(int salary) {
	this.salary = salary;
}



public Dept getDept() {
	return dept;
}



public void setDept(Dept dept) {
	this.dept = dept;
}



public MyDate getMydate() {
	return mydate;
}



public void setMydate(MyDate mydate) {
	this.mydate = mydate;
}



	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", salary=" + salary + ", dept=" + dept
				+ ", mydate=" + mydate + "]";
	}
	
	 
	
	 }
	

