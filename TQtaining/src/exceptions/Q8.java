package exceptions;

import java.io.File;
import java.util.Scanner;

public class Q8 {
	/*8.Create a class MyClass and create three methods myMethod1(), Method2() and Method3().
	Invoke Method2() from Method1() and Method3() from Method2().
	Write a code that can throw an exception inside myMethod3() and compile: File file=new
	File("filename.txt"); Scanner sc=new Scanner(file);
	You will get compilation errors now as you are not handling a checked exception
	FileNotFoundException. Handle the exeption using try catch block*/
	
	
	
	void myMethod1() throws Exception
	{
		Method2();
	}
	void Method2() throws Exception {
		Method3();
	}
    void Method3() throws Exception
    {
    	File file=new File("filename.txt");
    	 Scanner sc=new Scanner(file);
    }
	public static void main(String[] args) throws Exception {
		Q8 thr=new Q8();
		thr.myMethod1();
     
	}

}
