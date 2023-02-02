package exceptions;

public class Q10 {
	//10. WAP to show ClassNotFoundException
	public static void main(String[] args) {
	    try
	    {
	      Class.forName("NoClassExist");
	    }
	    catch (ClassNotFoundException ex)
	    {
	      ex.printStackTrace();
	    }
	  }
	

	}


