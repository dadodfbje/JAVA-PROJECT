package myExamo11feb;	
import java.util.ArrayList;
import java.util.Collections; 
import java.util.Comparator;
		
		
		class Employee{
			String name;
			public Employee() {}
			public Employee (String name)
			{
				this.name=name;
			}
			public String toString() {
				return "name="+name;
			}
			static class ComparatorName implements Comparator <Employee>{
				public int compare(Employee obj1,Employee obj2)
				{
					return obj1.name.compareTo(obj2.name);
				}
			}
		}
		
		
		public class ComparatorUsage{
			public static void main (String [] args)
			{
				Employee emp1=new Employee("ankit");
				Employee emp2=new Employee("bred");
				
				ArrayList<Employee> list =new ArrayList<Employee>();
				list.add(emp1);
				list.add(emp2);
				
				Collections.sort(list,new Employee.ComparatorName());
				System.out.println(list);
				
			}
		}
		
