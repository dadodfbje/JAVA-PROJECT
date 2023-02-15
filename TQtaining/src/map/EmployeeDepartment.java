package map;

import java.util.*;
import java.util.Map.Entry;

public class EmployeeDepartment {

	public static void main(String[] args) {
		HashMap<Employee, Department> excer = new HashMap<>();
		Employee fis = new Employee(143, "Darshan", "Dallas");
		Employee fis1 = new Employee(182, "Karan", "NewYork");
		Employee fis2 = new Employee(149, "Bhishma", "ManHattan");
		Employee fis3 = new Employee(210, "Arjun", "Oclahia");
		Employee fis4 = new Employee(345, "Billy", "Alabama");
		Department got = new Department(1, "Financial");
		Department got1 = new Department(2, "Research");

		excer.put(fis, got);
		excer.put(fis1, got1);
		excer.put(fis2, got1);
		excer.put(fis3, got);
		excer.put(fis4, got1);

		Set<Entry<Employee, Department>> it = excer.entrySet();
		for (Map.Entry<Employee, Department> set1 : it) {
			Employee s = set1.getKey();
			Department m = set1.getValue();			
			if (m.name.equals("Financial")) {
				System.out.println(s.name);
			}

		}  //System.out.print(excer);
	}

}
