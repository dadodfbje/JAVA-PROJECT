package arrayList;

public class Xobin18Feb1 {
	// WAP to convert the VOWEL character to upper case
	public static void main(String[] args) {
		String as = "i bought a toy car";
		char[] arr = as.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u') {

				if (arr[i] >= 97 && arr[i] <= 122) {
					arr[i] = (char) ((char) arr[i] - 32);

				}
            }
				 System.out.print(arr[i]);

			
		}
	}

}
