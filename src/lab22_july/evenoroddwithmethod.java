package lab22_july;
import java.util.Scanner;

public class evenoroddwithmethod {
	public static boolean isEven(int n) {
		return n%2==0;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a value");
		int value=sc.nextInt();
		if(isEven(value)) {
			 System.out.println(value + " is even.");
        } else {
            System.out.println(value + " is odd.");
        }
			
		}
		
	}


