package Coding;

public class Main {

	public static void main(String[] args) {
		String str = "11+3*13 - 23";
		char[] c = str.toCharArray();

		int[] ele = new int[str.length()];

		for (int i = 0; i < c.length; i++) {
			int j = i + 1;
			String s = "" + c[i];
			while (c[j] >= '1' && c[j] <= '9') {
				s = s + c[j];
			}
			ele[i] = Integer.parseInt(s);
		}

	}

}
