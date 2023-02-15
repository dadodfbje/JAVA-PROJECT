package assignmentArraylist4feb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q15 {
	//15.	WAP to search the specified collection in this collection
	public static void main(String[] args) {
		  ArrayList<String> cars = new ArrayList<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("Mazda");
		    cars.add("Hyundai");
		    cars.add("Raven");
		    cars.add("Honda");
		    ArrayList<String> cars1 = new ArrayList<String>();
		    cars.add("Honda");
		    cars.add("BMW");
		    cars.add("Porche");
		    
		    boolean b1=cars.contains(cars1);
		    if(b1==true)
		    {
		    	System.out.println("Given Collection Found");
		    }else
		    	System.out.println("Given Collection Not Found");
	}

}
