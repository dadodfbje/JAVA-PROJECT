package arrayList;

import java.util.ArrayList;

public class ArrayListMtd2ContainsAll {

	public static void main(String[] args) {
		//This Method Returns Boolean
		ArrayList<Integer> arr=new ArrayList<Integer>(3);
		arr.add(100);
		arr.add(456);
		arr.add(891);
		arr.add(394);
		arr.add(793);
		arr.add(600);
		arr.add(766);
		ArrayList<Integer> arr1=new ArrayList<Integer>(3);
		arr.add(1001);
		arr.add(4561);
		arr.add(8911);
		arr.add(3941);
		arr.add(7193);
		arr.add(1600);
		arr.add(7616);
		boolean b=arr.containsAll(arr1);
		if(b==true)
		{
			System.out.println("Given Collection Found");
		}else
		{
			System.out.println("Given Collection Not Found");
		}
		
	}

}
