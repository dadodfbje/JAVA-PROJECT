package assignment14Jan;

import java.util.Scanner;

import Jan4.BusTicket;

public class MainQ6 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
        Employee arr[]=new Employee[3];
       
        for(int i=0;i<arr.length;i++)
        {
           System.out.println("Enter The Department Name");
           String dname=sc.next();
           System.out.println("Enter The Department Sector");
           String did=sc.next();
           System.out.println("Enter Employee Name");
           String nam=sc.next();
           System.out.println("Enter the Employee id");
           int id=sc.nextInt();
           System.out.println("Enter the Employee Salary");
           int sal=sc.nextInt();
            System.out.println("Enter the Joining Date");
            
            int day=sc.nextInt();
       	System.out.print(day+"/");
          
            int month=sc.nextInt();
            System.out.print(day+"/"+month+"/");
            int year=sc.nextInt();

          
            arr[i]=new Employee(id,nam,sal,new Dept(did,dname),new MyDate(day,month,year));
            
            
        }
        
        
        
//        for(int i=0;i<arr.length;i++)
//        { 
//        	System.out.println(arr[i]);
//        	
//        }
        for(int i=0;i<arr.length-1;i++)
        {
        	for(int j=i+1;j<arr.length;j++)
        	{
        		if(arr[i].getDept().getDidname().equals(arr[j].getDept().getDidname()))
        		{    
        			System.out.println(arr[i]);
        			System.out.println(arr[j]);
        			
        		}
        	}
        }
	}

}
