package thisReferenceVariable;


		class AA 
		{ 
			AA() 
			{ 
			    System.out.println("Hello aa....."); 
			} 
			AA(int x) 
			{ 
			     this();
			    System.out.println(x);
			     
			} 
		} 
		class TestThisConstructor 
		{ 
			public static void main(String args[]) { 
			AA a = new AA(10);
			} 
		} 
			
			
