package assignment24Dec;

public class VolumeCalculator {

//OVER LOADING
	double calculateVolume (double radius,double height) 
	{
		double formula =3.14*radius*radius*height;
		return formula;
	}
	double calculateVolume(int length,int breadth,int height)
	{
		int formula =length*breadth*height;
		return formula;
	}
	public static void main(String[] args) {
		VolumeCalculator sc=new VolumeCalculator();
		
		System.out.println("Volume of the Cyliender = "+ sc.calculateVolume(3,2));
		System.out.println("Volume of the Cuboid = "+ sc.calculateVolume(3,2,1));
   
	}

}
