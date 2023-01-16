package dec21Assignment;

public class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=3;i++)
		{
		    for(int sp=3;sp>=i;sp--)
		    {
			   System.out.print(" ");
		    }
		       for(int j=1;j<=i;j++)
		       {
			        System.out.print(j);
		       }
		             for(int k=i;k>=1;k--)
		             {
			             System.out.print(k);
		             }
		   System.out.println();
		}
	}

}
