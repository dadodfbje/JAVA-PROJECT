package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Q4 extends Exception {
//4. WAP to show checked exception and use multiple catch block with universal Exception handler.
	public void  plot() throws FileNotFoundException
	{
		FileInputStream fis=new FileInputStream("C:/AssignmetOnIfelse.txt");
			System.out.println("File Found");	
	}
	
	
	public static void main(String[] args)  {
		Q4 find=new Q4();  
		try {
			find.plot();
		} catch (Exception e) {
			
			System.out.println("Fil Not Found");
		}
     
	}

}
