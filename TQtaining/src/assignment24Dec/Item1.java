package assignment24Dec;

public class Item1 {

	
		String item_name,brand;
		int price;
		int quantity;
		
		
		Item1()//default
		{
			item_name="pen";
			price=10;
			
		}
		Item1(int q)//parametrized
		{
			quantity=q;
		}
		Item1(String b)//parametrized
		{
			brand=b;
	}
		
		void display()
		{
			System.out.println(item_name);
			System.out.println(price);
		
			
		}
		void q_display()
		{
		System.out.println(quantity);
		}
		void b_brand()
		{
		System.out.println(brand);
		}
		
		
		

		public static void main(String[] args) {
			Item1 i=new Item1();
			Item1 i1=new Item1(7);
			Item1 i2=new Item1("natraj");
			
			i.display();
			i1.q_display();
			i2.b_brand();
			
			
	}

}
