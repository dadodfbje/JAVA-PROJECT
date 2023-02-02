package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class AutomaticResourceManagement {
          
	public static void main(String[] args) throws IOException {
		
         try (FileInputStream fis=new FileInputStream("c;/gottestnail.txt"))
         {
        	System.out.println("File Found");
         }catch(FileNotFoundException e)
         {
        	 System.out.println("File Not Found");
         }//No need of Finally Keyword for CleanUp Operation
	}

}
