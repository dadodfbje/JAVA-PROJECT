package assigment31Dec;

public class OverridingClass1{

	public void arc(int side) {
		System.out.println("HI"+side*side);
	}
}
		 class Class2 extends OverridingClass1 {	
			
			public void arc(int side)
			{   
				System.out.println("Area of Rectangle : "+side*side);
			}
			
	}


