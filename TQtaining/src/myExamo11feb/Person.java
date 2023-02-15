package myExamo11feb;

import java.util.ArrayList;
import java.util.Collections;

public class Person implements Comparable<Person> {
        
	int age;
	String name;
	Person(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
	public String toString()
	{
		return "Age :"+age+"<Name:"+name;
	}
	
	public int compare(Person o) {
		
		return (this.name.compareTo(o. name));
	}
	public static void main(String[] args) {
		ArrayList<Person> pl=new ArrayList<>();
		pl.add(new Person(45,"X"));
		pl.add(new Person(5,"NNN"));
		pl.add(new Person(5,"Y"));
		pl.add(new Person(5,"Abc"));
		pl.add(new Person(35,"ZZZ"));
		Collections.sort(pl);
		System.out.println((pl));

	

}
	@Override
	public int compareTo(Person o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	}
