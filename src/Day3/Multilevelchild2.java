// Multilevelchild2.java
package Day3;

public class Multilevelchild2 extends Multilevelparent {
    String colour = "red";

    public void displayAll() {
        System.out.println("Brand is " + brand);
        System.out.println("Model is " + model);
        System.out.println("Colour is " + colour);
    }

    public static void main(String[] args) {
        Multilevelchild2 obj = new Multilevelchild2();
        obj.start();
        obj.displayAll();
    }
}


