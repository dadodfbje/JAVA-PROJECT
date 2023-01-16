package dec21Assignment;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=5;i++)//rows
		{
			//System.out.print(i);
			System.out.print(" ");
			for(int j=1;j<=5 ;j++)//cols
			{
				
				System.out.print(" ");
				
				if(i==1||i==5||j==1||j==5)
				{
					
					System.out.print("*");
					
				}
				
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
		
	}

}
