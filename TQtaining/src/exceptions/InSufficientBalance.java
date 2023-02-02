package exceptions;
/*11.  Create  3 array which shows int acc[]{1001,1002,1003,1004,1005}
string anme[]={"ram","shyam","payal","pooja","sonam"};
int balance[]={1000,2000,3000,999,5000}
create a method check() which will check the balance and
if balance is less thn 1000 its should throw 
InsufficientBalanceException*/
public class InSufficientBalance extends Exception {
         public void check(int acc[],String anme[],int balance []) throws InSufficientBalance 
         {   
        	 for(int i=0;i<balance.length;i++)
        	 {
        		if (balance[i]<1000)
        		{
        			throw new InSufficientBalance();
        		}
        	 }
        	 
         }
	public static void main(String[] args) {
		InSufficientBalance  point=new InSufficientBalance ();
		int [] balance= {2000,500,900,7000};
		String anme[]={"ram","shyam","payal","pooja","sonam"};
		int acc[]={1001,1002,1003,1004,1005};
		try
		{
		   point.check(acc,anme,balance);
		}
		catch(InSufficientBalance e)
		{
			System.out.println("InsufficientBalanceException");
		}finally
		{
			System.out.println("Rest");
		}

	}

}
