package dec21Assignment;

public class TernaryLeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int year=1700;
String s=(year%4==0 && year%100!=0)?year+" is a leap year":(year%100==0 &&year%400==0)?year+" is a leap year":year+" is not a leap year";
System.out.println(s);	}
}