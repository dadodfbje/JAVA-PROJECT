package assignmentArraylist4feb;

import java.util.ArrayList;
import java.util.Collections;

public class Q19 {
	//19.	WAP to match two collections
	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
	   cars.add("Honda");
	    cars.add("BMW");
	    cars.add("Porche");
	   
	   
	    
	    ArrayList<String> cars1 = new ArrayList<String>();
	    cars1.add("Honda");
	    cars1.add("Porche");
	    cars1.add("BMW");
	    Collections.sort(cars);
        Collections.sort(cars1);
	    boolean b1=cars.equals(cars1);;
	    
	    if(b1==true)
	    {
	    	System.out.println("Given Collection Matched");
	    }else
	    	System.out.println("Given Collection Not Matched");
	}

}
