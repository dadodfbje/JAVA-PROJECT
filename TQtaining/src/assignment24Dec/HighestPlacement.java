package assignment24Dec;

import java.util.Scanner;

public class HighestPlacement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int cse=sc.nextInt();
int ece=sc.nextInt();
int mech=sc.nextInt();
 if(cse<0 || ece<0 || mech<0)
{   System.out.println("Input is Invalid");
} else if(cse==ece)
{ System.out.println("Highest placement");
System.out.println("CSE");
System.out.println("ECE");

}
else if(cse==mech)
{
   System.out.println("CSE");
   System.out.println("MECH");
}
else if(mech==ece)
{
   System.out.println("MECH");
   System.out.println("ECE");
}else

           {System.out.println("Highest placement");
String res=(cse>ece && cse>mech)?cse+" cse":(ece>cse && ece>mech)?ece+" ece":mech+" mech";
          System.out.println(res);
if(cse==ece && cse==mech && ece==mech)
     {  System.out.println("None of the department got Highest placement");
	}
           }
}
}
