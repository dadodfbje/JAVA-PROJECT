package arrayList;
import java.util.*;
public class CustomerMain {
           ArrayList<Supplier> excer=new ArrayList<Supplier>();
           
           CustomerMain( ArrayList<Supplier> excer)
           {
        	   this.excer=excer;
           }
           public  void check()
           {
        	   Iterator<Supplier> il=excer.iterator();
        	   while(il.hasNext())
        	   {   
        		   Supplier al=il.next();
        		   if(al.item.price>50000)
        		   {
        			   System.out.println(al.Name);
        			   System.out.println(al.location);
        			   System.out.println(al.item);
        		   }
        	   }
        	   
        	   
           }
           public  void checkSameCity()
           {
        	   Iterator<Supplier> il=excer.iterator();
        	   while(il.hasNext())
        	   {   
        		   Supplier al=il.next();
        		   if(al.location.equals("Dallas"))
        		   {
        			   System.out.println(al.Name);
        			   System.out.println(al.location);
        			   System.out.println(al.item);
        		   }
        	   }
        	   
        	   
           }
           
           
           
           
           
	public static void main(String[] args) {
		      Item fis=new Item(1,"maruti",50000);
		      Item fis1=new Item(2,"toyota",10000);
		      Item fis2=new Item(3,"landRover",60000);
		      Item fis3=new Item(4,"RangeRover",78000);
		      Item fis4=new Item(5,"Chrisma",35000);
		      Item fis5=new Item(6,"Headphones",90000);
		      Item fis6=new Item(7,"Watches",52000);
		      Item fis7=new Item(8,"SteamDeck",34000);
		      
		   
		      ArrayList<Supplier> excer=new ArrayList<Supplier>();
		      excer.add(new Supplier("Darshan","AmityVille", fis));
		      excer.add(new Supplier("Karan","mumbai",fis1));
		      excer.add(new Supplier("Bhishma","Dallas",fis2));
		      excer.add(new Supplier("Arjun","NewYork",fis3));
		      excer.add(new Supplier("Eklavya","LasVegas",fis4));
		      excer.add(new Supplier("Eklavya","Dallas",fis4));
		      excer.add(new Supplier("Parth","SouthCounty",fis5));
		      excer.add(new Supplier("Mritunjye","Dallas",fis6));
		      excer.add(new Supplier("Sashakt","Whales",fis7));
		      
		      CustomerMain fin=new CustomerMain(excer);
		    //  fin.check();
		      fin.checkSameCity();

	}

}
