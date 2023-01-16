package assignment7Jan;

import java.util.Scanner;

public class IIHT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the No Of Courses");
         int no=sc.nextInt();

       
         String [] arr= new String[no];
         int i=0;
          for( i=0;i<arr.length;i++)
          {    
        	  System.out.println("Enter the course");
        	 arr[i]=sc.next();
          }  System.out.println("Enter The Course To Be Searched");
                String write = sc.next();
          for( i=0;i<arr.length;i++)
          { 
        	   if(write.equals(arr[i]))
               {
             	  System.out.println(write+"Course is avilable");
               }        	   
          }  //          System.out.println("Enter the Courses Names");
//        String first=sc.next(),second=sc.next(),third=sc.next(),fourth=sc.next(),fifth=sc.next();
//        System.out.println("Enter The Course To Be Searched");
//        String write=sc.next();
       
//String fi=(write.equals(first))?write+" course is avilable":(write.equals(second))?write+"Course is avilable":(write.equals(third))?write+"course is avilable":(write.equals(fourth))?write+"course is avilable":(write.equals(fifth))?write+"course is avilable:write+":write+"course is not avilable";
 // System.out.println(fi);
//        if (write.equals(first))
//        {
//      	  System.out.println(write+" course is avilable");
//        }
//        else if (write.equals(second))
//        {
//      	  System.out.println(write+" course is avilable");
//        }
//        else if (write.equals(third))
//        {
//      	  System.out.println(write+" course is avilable");
//        }
//        else if (write.equals(fourth))
//        {
//      	  System.out.println(write+" course is avilable");
//        }
//        else if (write.equals(fifth))
//        {
//      	  System.out.println(write+" course is avilable");
//        }
//        else
//      	 System.out.println(write+" Course is not Avilable");
         
       
               
              
               

	}

}
