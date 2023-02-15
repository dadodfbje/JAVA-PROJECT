package arrayList;

public class Item {
          int id;
          String name;
          int price;
          public Item(int id,String name,int price)
          {
        	  this.id=id;
        	  this.name=name;
        	  this.price=price;
          }
          @Override
          public String toString()
          {
        	  return "ITEM( [ID ----->"+id+"] [Name ----->"+name +"] [Price ----->"+price+"] )";
          }
}
