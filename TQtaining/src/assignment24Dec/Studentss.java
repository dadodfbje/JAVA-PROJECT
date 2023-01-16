package assignment24Dec;

public class Studentss {

	
            
            int id;
            String name;
            double percentage;
            
            void document(int i,String n,double p) 
            {
            	 id=i;
            	 name=n;
            	 percentage=p;
            	 display();
            }
            void display()
            {
            	System.out.println(id);
            	System.out.println(name);
            	System.out.println(percentage);
            }
            public static void main(String[] args) {
            	Studentss sc=new Studentss();
            	System.out.println("contender1");
            	sc.document(420,"transformer", 96.54);
            	System.out.println("contender2");
            	sc.document(456, "nullbyte", 89.63);
            	
            	
            }
	}


