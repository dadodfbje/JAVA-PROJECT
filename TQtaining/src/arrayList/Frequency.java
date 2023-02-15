package arrayList;

import java.util.ArrayList;

public class Frequency {

	public static void main(String[] args) {
		int[] a = { 4, 5, 5, 4, 6, 6, 9, 4 };
		ArrayList<Integer> arr = new ArrayList<Integer>();
		System.out.println("Elements<---->Frequency");
		for (int i = 0; i < a.length; i++) {
			int count = 0;
			if (!arr.contains(a[i])) {
				arr.add(a[i]);
				count++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						count++;
						a[j] = 0;
					}
				}
			}

			if (a[i] != 0) {
				System.out.print("    " + a[i] + "<--------->");
				System.out.println(count);
			}
		}
		System.out.println(arr);

	}

}
