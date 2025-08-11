package Day8;

public class Defaulthandler {
    public static void main(String[] args) {
        System.out.println("Program started");

        int num1 = 10;
        int num2 = 0;

        // No try-catch — default handler will catch this
        int result = num1 / num2;  // ❌ Division by zero

        System.out.println("Result: " + result);  // This line never runs
        System.out.println("Program ended");      // This line never runs
    }
}