package arrayList;

import java.util.ArrayList;

public class ArrayListMtd12removeByElement {

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>(3);
		arr.add(100);
		arr.add(456);
		arr.add(891);
		arr.add(394);
		arr.add(793);
		arr.add(600);
		arr.add(766);
		arr.set(6, 8888);
		
		Integer a=394;
				arr.remove(a);
		System.out.println(arr);
	}

}
