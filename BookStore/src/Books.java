
public class Books {
	private int id;
	private String name;
	private static int no_of_copies=5;
	
	public Books(int id, String name) {
		this.id = id;
		this.name = name;
		//this.no_of_copies = no_of_copies;
	}
	 public static int calculateAvilability(int noOfBooks)
	   {     if(no_of_copies>=noOfBooks)
	            {no_of_copies=no_of_copies-noOfBooks;     
	             
	            }
	         else
	         {
	        	 System.out.println("Number of Copies You Want to Issue is Not Avilable");
	         }
	return no_of_copies;
	   }
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public int getNo_of_copies() {
		return no_of_copies;
	}
	public void setNo_of_copies(int no_of_copies) {
		this.no_of_copies = no_of_copies;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name  + ", no_of_copies=" + no_of_copies + "]";
	}
	
	
	
}
