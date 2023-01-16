package assignment7Jan;

class IPLTeam {
	void play() 
	{    
		System.out.println("Let's Play a Match");
		
	}

}
class CSK extends IPLTeam{
	   void play() 
	   {
		   super.play();
		   System.out.println("Let's Play 1st Match");
		
	   }
	
}
class RCB extends CSK{
	void play()
	{   
		super.play();
	    System.out.println("Let's Play 2nd Match");
	
    }
}