package exceptions;

public class InvalidRange extends Exception {
        public void check(int num) throws InvalidRange
        {
        	if(num<0 || num>999999)
        	{
        		throw new InvalidRange();
        	}
        }
	

}
