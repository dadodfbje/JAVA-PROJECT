package arrayList;

import java.util.ArrayList;

public class ArrayListMtd2Contains {
               //This method return Boolean
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>(3);
		arr.add(100);
		arr.add(456);
		arr.add(891);
		arr.add(394);
		arr.add(793);
		arr.add(600);
		arr.add(766);
		boolean b=arr.contains(766);
		System.out.println(b);
		

	}

}
