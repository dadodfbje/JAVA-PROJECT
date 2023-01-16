package assigment31Dec;

public class Volume {	

	public int arc(int length,int breadth)
	{   
		return length*breadth;
	}
	public int arc(int side)
	{
		
		 return side*side;
	}
	
	public static void main(String[] args) {
	   
	    Volume sc=new Volume();
	 System.out.println("Area of Rectangle  : "+sc.arc(20,25));
	 System.out.println("Area of Square  : "+sc.arc(20));

	}

}
