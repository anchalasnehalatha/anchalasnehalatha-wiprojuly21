package Day1and2;
import java.util.Scanner;

public class Primeornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        
        if (isprime(n)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

        sc.close();
    }

    static boolean isprime(int n) {
        if (n <= 1) {
            return false;
        }

        
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false; // Not prime
            }
        }

        return true; // Prime
    }
}
