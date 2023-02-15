package myExamo11feb;

import java.util.*;

public class ei8 {

	public static void main(String[] args) {
		List<String> arrayList=(List<String>) new ArrayList();
		arrayList.add("a");
		arrayList.add("b");
		
		Iterator<String> iterator=arrayList.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			arrayList.add("c");
		}

	}

}
