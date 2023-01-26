package string;

public class Q2 {
	//2. Write a code to prove that strings are immutable in java
	public static void main(String[] args) {
		// TODO Auto-generated method stub
                  String a="SCP";
                 a.concat("SLP");
                  System.out.println("("+a+")<---- as intialized value does not change this proves that Strings are immutable");
	}

}
