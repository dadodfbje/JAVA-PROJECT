package assigment31Dec;

public class Cycle {
 

   int accountNO;
   int noOfWheels;

   Cycle()
       {
          System.out.println("I am the Default Consructor");
       }
   Cycle(int so,int no) 
        {    
         	 this();
	         accountNO=so;
	         noOfWheels=no;
	         System.out.println("I am the Anoher Constructor");
	   
        }
	
	        public static void main(String[] args) {
            Cycle an=new Cycle(56695,8);


  
	}

}
