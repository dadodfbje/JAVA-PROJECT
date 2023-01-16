public class Marks {

	public static void main(String[] args) {
	int math=89;
	int eng=61;
	int hindi=74;
	int socialScience=90;
	int science=66;
	double Total=math+eng+hindi+socialScience+science;
	System.out.println(Total);
   double Avg=(Total)/5;
   
    System.out.println(Avg);
    
    double Percentage=(Total/500)*100;
    System.out.println(Percentage);
    
    if(Percentage>=90 )
    System.out.println("Grade = A+");
    
    else if (Percentage>=80 && Percentage<90)
    	System.out.println("Grade = A");
    
    else if (Percentage>=75 && Percentage<=79)
    System.out.println("Grade = B+");
	}
}
