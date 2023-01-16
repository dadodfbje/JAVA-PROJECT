package dec21Assignment;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)
		 {
			for(int sp=4;sp>=i;sp--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if(j==1 ||i==5||j==i|| j==2*i-1)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println("");
		 }
		for(int i=4;i>=1;i--)
		 {
			for(int sp=4;sp>=i;sp--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i-1;j++)
			{
				if(j==1 ||i==5||j==i|| j==2*i-1)
					System.out.print("*");
					else
						System.out.print(" ");
			}
			System.out.println("");
		 }
		

	}

}
