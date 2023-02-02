package string;
import java.util.Scanner;
public class InitialCaps
{
   public static void main(String[] args)
   {
      System.out.println("enter the string");
      Scanner scan=new Scanner(System.in);
      String ipString = "how are you doing martha";
      char[] ch = ipString.toCharArray();
      String result = "";
 
      for (int i = 0; i < ch.length; i++)
      {   
         if (i==0||ch[i-1]==' ') 
         {
    
            if (ch[i]>=97&&ch[i]<=122)
            {
               result = result+(char)(ch[i]-32);
              // System.out.println(result);
            }
            else           
               result = result+ch[i];
              // System.out.println(result);
         }
 

     }
 
      System.out.println(result);
   }
}