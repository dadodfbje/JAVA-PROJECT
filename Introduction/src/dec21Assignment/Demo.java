package dec21Assignment;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 34652;
		int sum  = 0;
		while(num>0) {
			int rem = num%10;
			int flag = 0;
			for(int i=2; i<rem; i++) {
				if(rem%i == 0) {
					flag = 1;
				}
			}
			num = num/10;
			if(flag == 0) {
				System.out.println(rem);
			if(flag == 0) {
					sum += rem;
					System.out.println(sum);
				}
				
			}
		}
		
	}

}
