package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentArrayList {

	public static void main(String[] args) {
		List<Student> excer=new ArrayList<>();
		Student got=new Student(469,"Atorey",89.54f);
		excer.add(got);
		excer.add(new Student(258,"Bressi",79.23f));
		excer.add(new Student(258,"Fonaldo",82.53f));
		excer.add(new Student(258,"Karan",99.78f));
		excer.add(new Student(258,"Arjun",89.14f));
		excer.add(new Student(258,"Bhishma",69.78f));
		excer.add(new Student(258,"LRDronaCharya",84.52f));
		
		
		Iterator<Student> al=excer.iterator();
		
		while(al.hasNext())
		{
			Student s=al.next();
			System.out.println(s);
		}
		

	}

}
