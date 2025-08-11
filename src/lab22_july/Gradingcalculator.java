package lab22_july;
import java.util.Scanner;

public class Gradingcalculator {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a marks");
		int marks=sc.nextInt();
		if (marks>=90  && marks<=100){
			System.out.println("A");
			}
		else if (marks>=75  &&  marks<=89) {
			System.out.println("B");
		}
		else if (marks>=60  &&  marks<=74) {
			System.out.println("C");
		}
		else if (marks>=40 && marks<=59) {
			System.out.println("D");
		}
		else {
			System.out.println("Fail");
		}
	}

}
