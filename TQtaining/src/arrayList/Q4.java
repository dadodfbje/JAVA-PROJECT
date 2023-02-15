package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Q4 {

	public static void main(String[] args) {
		List<String> a1=new ArrayList<String>();
		a1.add("A");
		a1.add("B");
		List<String> a12=new ArrayList<String>();
		a1.add("P");
		a1.add("Q");
		a1.addAll(0,a12);
	
		System.out.println(a1);

	}

}
