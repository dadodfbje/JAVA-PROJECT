package arrayList;

public class Supplier {
          String Name;
          String location;
          Item item;
          
          
          
          
          public Supplier(String name, String location,Item item) {
			super();
			Name = name;
			this.location = location;
			this.item = item;
		}
		
          @Override
          public String toString()
          {
             return "Supplier ( Naame "+Name+" Location "+location+" Item "+item +" )";
          }
}
