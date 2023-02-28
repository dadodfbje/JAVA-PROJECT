package myExamo18feb;
import java.util.Collection;
		import java.util.*;
public class Q5 {

	public static void main(String[] args) {			
				Collection<Integer> collection=new HashSet <Integer>();
				collection.add(3);
				collection.add(2);
				collection.add(1);
				collection.add(null);
				Set<Integer> treeSet=new TreeSet<Integer>();
				treeSet.addAll(collection);
				System.out.println(treeSet);
				
	}

}
