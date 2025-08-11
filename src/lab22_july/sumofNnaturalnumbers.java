package lab22_july;
import java.util.Scanner;

public class sumofNnaturalnumbers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a N value");
		int n=sc.nextInt();
		int sum=0;
		int i=1;
				while(i<=n) {
					sum+=i;
					
					i++;
				}
				System.out.println(sum);
				
	}

}
