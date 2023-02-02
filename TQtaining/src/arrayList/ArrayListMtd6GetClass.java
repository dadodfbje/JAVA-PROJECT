package arrayList;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class ArrayListMtd6GetClass {
                      // Return Class
	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>(3);
		arr.add(100);
		arr.add(456);
		arr.add(891);
		arr.add(394);
		arr.add(793);
		arr.add(600);
		arr.add(766);
       Class a=arr.getClass();
     //  System.out.println(a);
       Method [] m=a.getMethods();
       for(int i=0;i<m.length;i++)
       {
    	   System.out.println(m[i]);
       }
	}

}
