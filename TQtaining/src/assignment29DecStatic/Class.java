package assignment29DecStatic;

public class Class {
 String engine="V12";
static String company_name="magna";

//public static int does;
 static int totalCarSold;
 static void cars(String mod,String eng)
 {   //cannot pass instance variable in static method 
	 company_name=mod;
	// engine=eng;
	 Class sc=new Class();
	 //sc.trucks();
	 
}
 public void trucks(String mode)//String mode
 {    //static variable in non-static method can be call
	 company_name=mode;
 }


//static String model="magna";
//static int 

public static void main (String [] args) {
	
System.out.println( Class.company_name="cruise");
System.out.println(  Class.totalCarSold=4999);



	Class car1=new Class();
car1.company_name="sports";
car1.totalCarSold=10000;
//car1.car
	Class car2=new Class();
System.out.println(car2.company_name);
System.out.println(car2.totalCarSold);


}


}

