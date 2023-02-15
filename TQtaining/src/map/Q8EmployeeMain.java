package map;
import java.util.*;
public class Q8EmployeeMain {
	/*
	 * 8 class Employee(id,name,salary) Create and add 4 more Employee objects in
	 * ArrayList. Print ArrayList. Sort ArrayList using Collections.sort(list) based
	 * on name. If name are same then sort on id. Print arrayList.
	 */
	public static void main(String[] args) {
		ArrayList<Q8Employee> excer=new ArrayList<>();
		
	    excer.add(new Q8Employee(146,"Darshan",80000,"dallas","Oclahoma"));
	    excer.add(new Q8Employee(864,"Karan",20000,"Manhattan","NewYork"));
	    excer.add(new Q8Employee(124,"Arjun",50000,"Cisli","Italy"));
	    excer.add(new Q8Employee(146,"Bhishma",180000,"Mecaa","SaudiArabia"));
	    excer.add(new Q8Employee(745,"Krishna",8000,"Peshawar","Pakistan"));
	    excer.add(new Q8Employee(623,"Dronacharya",65000,"Ciatle","USA"));
	    Collections.sort(excer);
	    Iterator<Q8Employee> it=excer.iterator();
	    while(it.hasNext())
	    {
	    	Q8Employee got=it.next();
	    	System.out.println(got);
	    }
//	    System.out.println("Sorting on the basis of country");
//	    Collections.sort(excer,new Q9SortingCountry());
//	    Iterator<Q8Employee> it1=excer.iterator();
//	    while(it1.hasNext())
//	    {
//	    	Q8Employee got=it1.next();
//	    	System.out.println(got);
//	    }

	}

}
