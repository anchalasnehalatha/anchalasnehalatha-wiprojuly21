package lab22_july;
import java.util.Scanner;

public class Maxofthreenum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter n1,n2,n3 values");
		int n1=sc.nextInt();
		int n2=sc.nextInt();
		int n3=sc.nextInt();
		if(n1>=n2 && n1>=n3) {
			System.out.println("n1 is bigger :" +n1);
			
		}
		else if (n2>=n1 && n2>=n3){
			System.out.println("n2 is greater :" +n2);
			
		}
		else {
			System.out.println("n3 is greater :" +n3);
		}
			
		
	}

}
