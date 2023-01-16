package assignment7Jan;

public class BusTicket {
	
	
	private int ticketNo;
    private float ticketPrice;
    private float totalAmount;
    private Person person;
   
    public BusTicket(int ticketNo, float ticketPrice, Person person) {
		
		this.ticketNo = ticketNo;
		this.ticketPrice = ticketPrice;
	//	this.totalAmount = totalAmount;
		this.person = person;
	}

	public int getTicketNo() {
		return ticketNo;
	}

	public void setTicketNo(int ticketNo) {
		this.ticketNo = ticketNo;
	}

	public float getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(float ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public float getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	void calculateTotal()
	{
		int total=0;
		 if(person.getAge()<=16)
		 {
			 total= (int) (ticketPrice*0.5);
			 this.totalAmount=ticketPrice-total;
		 }
		 else if (person.getGender().equals("F")  && (person.getAge()>16 && person.getAge()<60))
		 {
			 total =(int) (ticketPrice*0.1);
			 this.totalAmount=ticketPrice-total;
		 }
		 if (person.getAge()>60)
		 {
	            total= (int) (ticketPrice*0.25);
	            this.totalAmount=ticketPrice-total;
		 }
		
		
	}
	
}
