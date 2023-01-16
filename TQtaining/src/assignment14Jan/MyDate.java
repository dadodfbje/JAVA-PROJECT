package assignment14Jan;

public class MyDate {
     int day;
     int month;
    int year;
    
    
     public MyDate(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
    
   
	public void setDay(int day)
    {
    	this.day=day;
    }
    public int getDay()
    {
    	return day;
    }
    public void setMonth(int month)
    {
    	this.month=month;
    }
    public int getMonth()
    {
    	return month;
    }
    public void setYear(int year)
    {
    	this.year=year;
    }
    public int getYear()
    {
    	return year;
    }
	@Override
	public String toString() {
		return "MyDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
    
}
