package arrayList;

import java.util.ArrayList;

public class ArrayAddMoreThanLength {

	public static void main(String[] args) {
		/*Here Even if You give the Size of ArrayList Still 
		you can add more than the length of the ArrayList*/
		ArrayList<Integer> arr=new ArrayList<Integer>(3);
		arr.add(100);
		arr.add(456);
		arr.add(891);
		arr.add(394);
		arr.add(793);
		arr.add(600);
		arr.add(766);
		for(int a:arr)
		{
			System.out.println(a);
		}
	}

}
