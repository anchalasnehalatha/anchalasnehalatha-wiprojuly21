package lab22_july;
import java.util.Scanner;
public class Fibonacciseries {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value:");
		int n=sc.nextInt();
		int n1=0;
		int n2=1;
		System.out.println(n1 + " "+ n2);
		int n3;
		for(int i=1;i<=n;i++) {
			n3=n1+n2;
			System.out.println(n3 +" ");
			n1=n2;
			n2=n3;
		}
				
	}

}
