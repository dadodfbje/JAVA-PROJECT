package dec21Assignment;

public class Febnosis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=0;
int b=1;
int count=0;
for (int i=2;i<10;i++)
{count=a+b;
System.out.print(" "+count);
a=b;
b=count;
}
	}

}
