package thiskeywordforConstructor;
         /* Calling default constructor from parameterized 
           constructor:*/

class AA {
   AA()
   {
      System.out.println("Hello aa.....");
   }
    AA(int x) {
      this();
      System.out.println(x);
      
    }
}
class TestThis5 {
public static void main(String args[]) {
AA a = new AA(10);
}
}

