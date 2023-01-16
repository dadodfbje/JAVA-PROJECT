package assignment14Jan;

import java.util.Scanner;

public class TheatreMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Theatre arr[]=new Theatre[6];
		 arr[0]=new Theatre(123,"Patton Creek 15","NYC LasVegas",new Movie(420,"Moisture",8.2));
		 arr[1]=new Theatre(125,"Pinnacle Cinemas","Fort Bragg Unified",new Movie(460," The Shawshank Redemption",6.7));
		 arr[2]=new Theatre(126,"Cinemark","Czech Village",new Movie(484," Forrest Gump",9.2));
		 arr[3]=new Theatre(127,"Norterra 14 ","Kingston Village",new Movie(491,"Schindler's List",6.8));
		 arr[4]=new Theatre(128,"Arizona Mills 25 with IMAX ","Professorville Historic District",new Movie(401,"The Godfather",10));
		 arr[5]=new Theatre(136,"Tempe Marketplace 16  ","Birmingham District",new Movie(261,"The Second Case",8.9));

		for(int i=0;i<arr.length;i++)
		{    
			for (int j=i+1;j<arr.length;j++)
            { 
			if(arr[i].movie.rating<arr[j].movie.rating)
			{
				double temp=arr[i].movie.rating;
				arr[i].movie.rating=arr[j].movie.rating;
				arr[j].movie.rating=temp;
				
				int  temp1=arr[i].movie.movieid;
				arr[i].movie.movieid=arr[j].movie.movieid;
				arr[j].movie.movieid=temp1;
				
				String temp3=arr[i].movie.moviename;
				arr[i].movie.moviename=arr[j].movie.moviename;
				arr[j].movie.moviename=temp3;
				
				
				int temp4=arr[i].theatreid;
				arr[i].theatreid=arr[j].theatreid;
				arr[j].theatreid=temp4;
				
				
				String temp5=arr[i].theatrename;
				arr[i].theatrename=arr[j].theatrename;
				arr[j].theatrename=temp5;
				
				String temp6=arr[i].location;
				arr[i].location=arr[j].location;
				arr[j].location=temp6;
			}
            }
			System.out.println(arr[i]);
		}
//		System.out.println("Enter the Theatre ID");
//        int id=sc.nextInt();
//		System.out.println("Enter the Theatre Name");
//		String name=sc.next();
//		System.out.println("Enter the Theatre Location");
//		String location=sc.next();
//		System.out.println("Enter the Movie ID");
//		int id1=sc.nextInt();
//		System.out.println("Enter the Movie Name");
//		String mname=sc.next();
//		System.out.println("Enter the Movie Rating");
//		int rate=sc.nextInt();
//		
		
//		arr[i].toString();		}
	}

}
