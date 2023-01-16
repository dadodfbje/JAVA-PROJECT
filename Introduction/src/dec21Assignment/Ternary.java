package dec21Assignment;

import java.util.Scanner;

public class Ternary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
int num1=sc.nextInt();
int num2=sc.nextInt();
int num3=sc.nextInt();
int res=(num1>num2 && num1>num3)?num1:(num2>num1 && num2>num3)?num2:num3;
System.out.println(res);
	}

}
