package assignment12Jan;

public class Supplier1 {
	int id=10;
	String name;
	static String c_name="Samsung";
    Item i;
	

	public Supplier1(int id, String name, Item i) {
		super();
		this.id = id;
		this.name = name;
		this.i = i;
	}
	
	

	public Item getI() {
		return i;
	}



	public void setI(Item i) {
		this.i = i;
	}



	@Override
	public String toString() {
		return "Supplier1 [id=" + id + ", name=" + name + ", i=" + i + "]";
	}

	
		
	}

