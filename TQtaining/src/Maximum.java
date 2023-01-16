
public class Maximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=67681;
	int max=num%10;
	num=num/10;
	while(num>0)
		{ int rem=num%10;
		if(rem>max)
			{
			max=rem;
			}
		num=num/10;
				
}System.out.println(max);
			}
		}


