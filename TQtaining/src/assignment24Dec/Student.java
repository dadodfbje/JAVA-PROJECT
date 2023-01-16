package assignment24Dec;

public class Student {
	int id;
	String name;
	
	Student()
	{
		
	}
  Student(int i,String n)
   {
	  id=i;
	  name=n;
	  
	   
   }
  
   void display()
  {
	  System.out.println("id is..."+id);
	  System.out.println("name is..."+name);
  }
	public static void main(String[] args) {
		Student s1=new Student(1,"pooja");
		
		
		s1.display();
		Student s2=new Student();
		s2.id=s1.id;
		s2.name=s1.name;
		s2.display();

	}

}
