package assignment12Jan;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student main[]=new Student[3];
	
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<main.length;i++)
		{
			System.out.println("Enter marks");
			int ma=sc.nextInt();
			System.out.println("Enter Name");
			String nam=sc.next();
			System.out.println("Enter Roll No");
			int ros=sc.nextInt();
	  
		main[i]=new Student();
		main[i].setMarks(ma);
		main[i].setName(nam);
		main[i].setRoll(ros);
       }
		Student.sort(main);
		
		for(Student st:main)
		{
			System.out.println(st);
		}
		
		for(int i=0;i<main.length;i++) {
			main[i].toString();
		}
			
			
}
}
