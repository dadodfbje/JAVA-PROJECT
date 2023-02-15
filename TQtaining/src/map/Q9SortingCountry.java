package map;

import java.util.Comparator;

public class Q9SortingCountry implements Comparator<Q8Employee> {

	@Override
	public int compare(Q8Employee o1, Q8Employee o2) {

		return o1.country.compareTo(o2.country);
	}
                      
}
