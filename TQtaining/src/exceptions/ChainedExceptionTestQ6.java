package exceptions;

class CustomException extends Exception
{  
 CustomException(String s)
 {  
  super(s);  
 }  
} 

public class ChainedExceptionTestQ6
{  
  static void validate(int age)throws CustomException
  {  
     if(age<18)
     throw new CustomException("Invalid Age");  
     else  
     System.out.println("Successful!!");  
   }  
     
   public static void main(String args[])
   {  
      try  
      {
         validate(13);  
      }
      catch(Exception ex)
      {
       ex.printStackTrace();
      } 
  }  
} 
