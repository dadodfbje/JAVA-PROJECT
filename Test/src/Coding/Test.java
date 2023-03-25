package Coding;

public class Test {
	void display(int num) {
		
		int temp = num % 10;
		num = num / 10;
		int flag=0;
		
		while (num > 0) {
             flag = 0;
			// int temp=num%10;
			int temp1 = num% 10;
			if (temp > temp1) {
				flag = 1;
				// System.out.println("Number is in Incresing order");
				// break;
			}
			num = num / 10;
		}
		if (flag == 1) {
			System.out.println("Number is in Incresing order");
		} else {
			System.out.println("Not");
		}

	}

	public static void main(String[] args) {
		Test got = new Test();
		got.display(1273456);

	}

}
