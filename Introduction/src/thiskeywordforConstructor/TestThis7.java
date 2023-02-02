package thiskeywordforConstructor;
         /*  The this() constructor call should be used to reuse the 
          constructor from the constructor. It maintains the chain 
          between the constructors i.e. it is used for constructor 
          chaining. Let's see the example given below that displays 
           the actual use of this keyword.*/
class Student3 {
int rollno;
String name, course;
float fee;
Student3(int rollno, String name, String course) 
{
this.rollno = rollno;
this.name = name;
this.course = course;
}
Student3(int rollno, String name, String course, 
float fee) {
this(rollno, name, course);// reusing 
//constructor
this.fee = fee;
}
void display() {
System.out.println(rollno + " " + name + " "
+ course + " " + fee);
}
}
class TestThis7 {
public static void main(String args[]) {
Student3 s1 = new Student3(111, "ankit", 
"java");
Student3 s2 = new Student3(112, "sumit", 
"java", 6000f);
s1.display();
s2.display();
}
}
