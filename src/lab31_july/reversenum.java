package lab31_july;
import java.util.Scanner;

public class reversenum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int rev=0;
		while(n!=0) {
			int k=n%10;
			rev=(rev*10)+k;
			n/=10;
			
		}
		System.out.println(rev);
	}

}
