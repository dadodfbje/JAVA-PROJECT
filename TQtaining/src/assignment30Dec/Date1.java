package assignment30Dec;

public class Date1 {
	
	int mm;
	int dd;
	int yyyy;
	public Date1(int mm, int dd, int yyyy) {
		
		this.mm = mm;
		this.dd = dd;
		this.yyyy = yyyy;
	}
	@Override
	public String toString() {
		return  mm + "/" + dd + "/" + yyyy ;
	}
	
	
	
	

}
