package arrayList;

import java.util.ArrayList;

public class ArrayListMtd7indexOf {

	public static void main(String[] args) {
		//Return Mormal Primitive Type
		ArrayList<Integer> arr=new ArrayList<Integer>(3);
		arr.add(100);
		arr.add(456);
		arr.add(891);
		arr.add(394);
		arr.add(793);
		arr.add(600);
		arr.add(766);
		int a=arr.indexOf(891);
		System.out.println(a);

	}

}
