package arrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Xobin18Feb {
	// Remove all even numbers from arraylist
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> excer = new ArrayList<Integer>();
//		excer.add(10);
//		excer.add(13);
//		excer.add(12);
//		excer.add(5);
//		excer.add(6);
//		excer.add(7);
//		excer.add(9);

		for (int i = 0; i < 7; i++) {
			System.out.println("Enter the Element");
			excer.add(sc.nextInt());
		}
		for (int i = 0; i < excer.size(); i++) {

			if (excer.get(i) % 2 == 0) {
				excer.remove(i);
			}
		}
		for (int i = 0; i < excer.size(); i++) {
			if (excer.get(i).equals(9)) {
				System.out.println(excer.get(i));
			} else {
				System.out.print(excer.get(i) + ",");
			}
		}

	}

}
