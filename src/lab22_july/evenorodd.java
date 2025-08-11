package lab22_july;

import java.util.Scanner;

public class evenorodd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a marks");
		int n=sc.nextInt();	

	if(n%2==0) {
		System.out.println("evennumber");
	}
	else {
		System.out.println("Oddnumber");
	}

}
}
