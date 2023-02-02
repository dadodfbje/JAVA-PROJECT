package thiskeywordforConstructor;
           /*  Calling parameterized constructor from default 
             constructor:*/
 
class AAA {
          AAA()
          {
             this(5);
            System.out.println("Hello aaa.....");
         }
         AAA(int x) 
         {
           System.out.println(x);
         }
     }
class TestThis6 {
public static void main(String args[]) {
AAA a = new AAA();
}
}
