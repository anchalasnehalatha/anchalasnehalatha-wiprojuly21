package Day1and2;
//Final class - cannot be extended
final class FinalClass {
 final int finalVariable = 100; // final variable - cannot be modified

 final void finalMethod() {     // final method - cannot be overridden
     System.out.println("This is a final method.");
     System.out.println("Final variable value: " + finalVariable);
 }
}


/*
class SubClass extends FinalClass {
 // Error: Cannot inherit from final class
}
*/

public class demo{
 public static void main(String[] args) {
     FinalClass obj = new FinalClass();
     obj.finalMethod();

     
     // obj.finalVariable = 200; // Error: cannot assign a value to final variable
 }
}

