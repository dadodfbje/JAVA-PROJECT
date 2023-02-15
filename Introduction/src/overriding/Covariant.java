package overriding;
        class Animal{
            Animal sound() {
            	System.out.println("Animal Sound");
            	return this;
            }
        }
        
        
          class Dog extends Animal{
        	  
        	  Dog sound() {
        		  System.out.println(super.sound());
        		  System.out.println("Dog Sound");
        		  return this;
        	  }
        	  
          }

public class Covariant {
            public static void main(String [] args) {
                Animal d=new Dog();
            	Animal d1=d.sound();
            	System.out.println(d1);
            	
            }
}
