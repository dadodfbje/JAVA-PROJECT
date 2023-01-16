package assignment30Dec;

import java.util.Scanner;

public class BusTicket2 {
     private int ticketNo;
     private float ticketPrice;
     private float totalAmount;
     private Person person;
     float discount;
     char gen='F';
     float a;
     float b;
	public float getB() {
		return b;
	}
	public void setB(float b) {
		this.b = b;
	}
	public float getA() {
		return a;
	}
	public void setA(float a) {
		this.a = a;
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
//	public Person getPerson() {
//		return person;
//	}
//	public void setPerson(Person person) {
//		this.person = person;
//	}
	public void calculateTotal()
	 {
		 Scanner sc=new Scanner(System.in);
			BusTicket2 ti=new BusTicket2();
         Person ag=new Person();
         System.out.println("Enter the Gender (M or F)");
         ag.setGender(sc.next().charAt(0));
         System.out.println("Enter the Age");
	      ag.setAge(sc.nextInt());
	      System.out.println("Enter the Ticket Price");
			ti.setTicketPrice(sc.nextInt());
		 if(ag.getAge()<=16)
		 {
			 discount=0.5f;
			 a= ti.getTicketPrice()*discount;
			 
		 }
		 else if (ag.getAge()>=60)
		 {
			 discount=0.25f;
			 a=ti.getTicketPrice()*discount;
		 }
		 else if (ag.getGender()==gen && ag.getAge()>=60)
		 {
			 discount=0.35f;
			 a=ti.getTicketPrice()*discount;
		 }
		 else
		 {
			 System.out.println("No Discount");
		 }	
	
		
		 b=totalAmount=ti.getTicketPrice()-a;
	    a=ti.getTicketPrice();
	   
	  
	 }
}
