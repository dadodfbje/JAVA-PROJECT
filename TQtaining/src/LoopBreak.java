
public class LoopBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=69;
		int square=num*num;
		while(num>0)
		{if(num%10!=square%10) {
			System.out.println("false");}
		num=num/10;
		square=num/10;
		}System.out.println("true");
		}
}