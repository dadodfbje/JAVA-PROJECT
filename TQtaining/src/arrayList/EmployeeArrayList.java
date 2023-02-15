package arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
            /*  WAP to create Emp (id,name,sal) object and add objects to ArrayList.
                                  from above program*/
public class EmployeeArrayList {

	public static void main(String[] args) {
		List<Employee> excer=new ArrayList<Employee>();
		Employee got=new Employee(741,"Bressi",78000);
		excer.add(got);
		excer.add(new Employee(845,"Fonaldo",82000));
		excer.add(new Employee(846,"teymar",20000));
		excer.add(new Employee(847,"LukaModrick",15000));
		excer.add(new Employee(848,"Ronaldinho",10000));
		excer.add(new Employee(849,"David Beckham",9000));
		excer.add(new Employee(980,"Sachin",45000));
		excer.add(new Employee(981,"Kachin penpulkar",16000));
		excer.add(new Employee(982,"Vladimir Putin",90000));
		ArrayList<Integer> fis=new ArrayList<Integer>();
		
		int max=0;
		Iterator<Employee> al=excer.iterator();
		while(al.hasNext())
		{
			Employee s=al.next();
			if(s.salary>10000)
			{
			   //System.out.println(s);
			} 												
			if(s.name=="Sachin")
			{
			  //System.out.println(s);
			}
			 
		    if(s.salary>max)
		    {
		    	max=s.salary;		    	
		   	}
		    fis.add(s.salary);
		 }   
		    
			//System.out.println(max);
			//System.out.println(Collections.max(fis));
			
		
			
			
			
			
			
			

	}

}
