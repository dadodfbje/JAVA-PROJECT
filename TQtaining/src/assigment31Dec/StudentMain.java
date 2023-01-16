package assigment31Dec;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		 Student m=new Student(102,"Adarsh","# 486,Gandhi Nagar Colony WestBengal");
	        Student m1=new Student(103,"Aman","# 2685 ABC Street Karnatka");
		
		
		Scanner sc=new Scanner(System.in);	   
		do
		  {
			         
		      String choice=sc.next();
	          
		
		            switch(choice)
		                {
		                   case "YES":
	                            	{
	                            	   System.out.println("StudentID = "+m.getStudentId());
	                      	           System.out.println("Student Name = "+m.getSudentName());
	                      	           System.out.println("Student Address = "+m.getStudentAddress());
	                      	           System.out.println("NIT");
	                      	           break;
			
		                            }
		                 case "NO":
		                            {
		                            	  System.out.println("StudentID = "+m1.getStudentId());
		                          	      System.out.println("Student Name = "+m1.getSudentName());
		                          	      System.out.println("Student Address = "+m1.getStudentAddress()); 
		                          	      m1.setCollegeName(sc.next());
		                          	      System.out.println("College Name = "+m1.getCollegeName());
		                          	      break;
			
		                           }
		                   default:
		                	  System.out.println(" Wrong Input");
		                	  System.out.println("enter choice");
		              }
		    }while(true);
    	}
	     
	
	
	
	

	}


