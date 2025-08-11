package Day1and2;

public class ParameterizedMethods {

    // Normal method
    public void add() {
        int a = 7;
        int b = 8;
        int c = a + b;
        System.out.println(c);
    }

    // Method with Parameters
    public void add1(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    public static void main(String[] args) {
        ParameterizedMethods pm = new ParameterizedMethods();
        pm.add();        // Calls normal method
        pm.add1(7, 8);   // Calls parameterized method
        pm.add1(8, 4);
    }
}
