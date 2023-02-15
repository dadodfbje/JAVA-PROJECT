package myExamo11feb;
			
import java.util.Arrays;
import java.util.Comparator;
		class Sort implements Comparator <Integer> {
			public int compare (Integer ol, Integer o2)
			{ 
				return o2.compareTo(01);
			}
		}
		public class MyClass {
		public static void main(String...a)
		{ 
			Integer intArray[]={2,3,1};
			Arrays.sort(intArray, new Sort());
			for (int i: intArray)
			{ System.out.print(i+" ");
		}

	}

}
