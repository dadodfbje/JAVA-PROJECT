package arrayList;

import java.util.ArrayList;
import java.util.List;

public class Q3 {

	public static void main(String[] args) {
		List<String> a1=new ArrayList<String>();
		a1.add("A");
		a1.add("B");
		a1.add("A");
		a1.add("B");
		a1.add("A");
		a1.remove("A");
		System.out.println(a1);

	}

}
