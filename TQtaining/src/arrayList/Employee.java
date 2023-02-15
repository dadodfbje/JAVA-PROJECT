package arrayList;
/*WAP to create Emp (id,name,sal) object and add objects to ArrayList.
from above program

WAP to print Emp whose salary is gretaer than 10000
 WAP to print Emp who have name Sachin
 WAP to print Emp who have highest number of salary*/
public class Employee {
         int id;
         String name;
         int salary;
         
         public Employee(int id, String name,int salary)
         {
        	 this.id=id;
        	 this.name=name;
        	 this.salary=salary;
         }
         @Override
         public String toString()
         {
        	 return "Employee Info ( ID----> "+id+", Name----> "+name+", Salary----> "+salary+")";
         }
}
