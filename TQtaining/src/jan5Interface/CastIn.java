package jan5Interface;
     
    interface cake
    {
    	public abstract void bake();
    }
    class StrawBerry implements cake
   {
	 @Override
	 public void bake()
	 {
		 System.out.println("Overcooked cake");
		 
	 }
   }
     class BlackForest implements cake
    {   
    	 @Override
    	public void bake()
    	{
    		System.out.println("Overfried Cake");
    	}
    }
    public class CastIn
    {
    	
	public static void main(String[] args) {
		
        cake sc=new StrawBerry();
        cake s=new BlackForest();
        sc.bake();
        s.bake();
	}

	}
