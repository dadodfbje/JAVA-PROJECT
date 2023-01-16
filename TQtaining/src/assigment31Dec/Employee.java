package assigment31Dec;

public class Employee {
	int id;
 String name="V12";
static String company_name="magna";

//public static int does;
 //static int totalCarSold;
 static void cars(String mod,String eng)
 {   //cannot pass instance variable in static method 
	 
// name=mod;
	 company_name=eng;
// engine=eng;
	 Employee sc=new Employee();
//	 sc.trucks();
	 
}
 public void trucks(String mode)//String mode
 {    //static variable in non-static method
	 company_name=mode;
 }


//static String model="magna";
//static int 

public static void main (String [] args) {
	
System.out.println( Employee.company_name="cruise");
//System.out.println(  Employee.totalCarSold=4999);



	Employee car1=new Employee();
	car1.company_name="sports";
	//Employee.totalCarSold=10000;
	Employee car2=new Employee();
System.out.println(car2.company_name);
//System.out.println(car2.totalCarSold);


}


}

