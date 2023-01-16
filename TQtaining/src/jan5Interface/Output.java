package jan5Interface;


	interface X
	{
	public abstract void methodX();
	}
	class Y implements X
	{
		@Override
	 public void methodX()
	 {
	 System.out.println("Method X");
	 }
	}
	public  class Output {
		public static  void main(String [] args) {
			Y sc=new Y();
			sc.methodX();
		   
		}
		
		
		
		
		
	}


 