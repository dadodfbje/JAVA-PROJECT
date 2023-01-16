package assignment12Jan;

import java.util.Scanner;

public class Student {
	private int roll; 
	private String name; 
	private int marks;
	  
	public void setRoll(int roll)
	{
	     this. roll=roll;
	}
	public int getRoll() 
	{
		return roll;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setMarks(int marks)
	{
		this.marks=marks;
	}
	public int getMarks()
	{
		return marks;
	}
	@Override
	public String toString()
	{
		return "RollNo "+roll+" Name "+name+" Marks "+marks;
	}   Student main[]=new Student[3];
	public static void sort(Student main[])
	{
		
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<main.length;i++)
		{
			for(int j=i+1;j<main.length;j++)
			{
				if(main[i].getMarks()<main[j].getMarks())
				{
					int temp=main[i].getMarks();
					int mark=main[j].getMarks();
					main[i].setMarks(mark);
					main[j].setMarks(temp);
					
					
					String temp1=main[i].getName();
					String mark1=main[j].getName();
					main[i].setName(mark1);
					main[j].setName(temp1);
					
					int temp3=main[i].getRoll();
					int mark3=main[j].getRoll();
					main[i].setRoll(mark3);
					main[j].setRoll(temp3);
					
					
				}
				
			}
		}
		
		
	} 

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
