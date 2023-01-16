import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Table Of");
int n=sc.nextInt();
for(int i=1;i<=10;i++ ) {
	int table=n*i;
	System.out.print(table+" ");
}
	}

}
