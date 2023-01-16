package assigment31Dec;

public class ThisKeyword {
	int acc;
	String no;
	double ch;
	
	ThisKeyword(int acc,String no,double ch)
	{
		this.acc=acc;
		this.no=no;
		this.ch=ch;
		System.out.println(acc);
		System.out.println(no);
		System.out.println(ch);
	}
	public void example(int ac,String o,double h)
	{   
		this.acc=ac;
	this.no=o;
	this.ch=h;
	System.out.println(acc);
	System.out.println(no);
	System.out.println(ch);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ThisKeyword sc=new ThisKeyword(10,"usable",30.0);
     sc.example(12345600,"note", 30.125);
	}

}
