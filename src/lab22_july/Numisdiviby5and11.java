package lab22_july;
import java.util.Scanner;

public class Numisdiviby5and11 {
	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
	        System.out.println("Enter a number ");
	        int num = sc.nextInt();
	        if(num%5==0 && num%11==0) {
	        	System.out.println("Yes it is divisible by both 5 and 11");
	        }
	        else {
	        	System.out.println("It is not divisible by 5 and 11");
	        }
	}

}
