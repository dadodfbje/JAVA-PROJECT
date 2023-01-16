package JavaClasses;

public class Luxury {
	String car;
	String type;
	String engine;
	String consume;
	String tyres;
	String gear;
	int turbinespins;
	
	void thrust(){
		System.out.println("MercedesA15");
		System.out.println("Sedan");
		System.out.println("W16");
		System.out.println("Diesel");
		System.out.println("reinflat");
		System.out.println("Automatic");
		System.out.println(1200+" RPM");
		
		
	}
	void turboinstallation()
	{
		turbinespins=1200*30/100+1200;
		System.out.println(turbinespins+" RPM");
	}
	

	public static void main(String[] args) {
		Luxury amg=new Luxury();
		amg.thrust();
		amg.turboinstallation();
		

	}

}
