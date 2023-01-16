package assignment28Dec;

import java.util.Scanner;

public class Employee1Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Employee1 sc=new Employee1();
    Scanner a=new Scanner(System.in);
    System.out.println("Enetr ID");
    int em=a.nextInt();
    System.out.println("Enter Name");
    String na=a.next();
    System.out.println("Enter Salary");
    double sa=a.nextDouble();
    System.out.println("Enter PF Percentage");
   int ne=a.nextInt();
    
     sc.setEmployeeId(em);
     sc.setEmployeeName(na);
     sc.setSalary(sa);
     sc.calculateNetSalary(ne);
     System.out.println("ID :"+sc.getEmployeeId());
     System.out.println("Name :"+sc.getEmployeeName());
	 System.out.println("Salary :"+sc.getSalary());
	double x=sc.getSalary()-ne;
	
	sc.setNetSalary(x);
	System.out.println("Net Salary :"+sc.getNetSalary());
	
	
	
	}

}
