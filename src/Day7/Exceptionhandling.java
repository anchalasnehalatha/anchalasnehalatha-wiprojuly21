package Day7;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionhandling {
	public static void main(String[] args) {
		System.out.println("programstarts");
		System.out.println("Enter a value");
		Scanner sc=new Scanner(System.in);
		
		try {
			int val=sc.nextInt();
			System.out.println(val);
			String str=null;
			System.out.println(str.length());
			int a[]= {1,2,3,4};
			System.out.println(a[4]);
			String s="java";
			System.out.println(s.charAt(4));
		System.out.println(100/0);
	}
		catch (InputMismatchException e) {
            System.out.println("InputMismatchException: Please enter a valid integer.");
		}
		catch(ArithmeticException Ae){
			System.out.println("Arithmetic exception");
		}
		catch(NullPointerException e ) {
			System.out.println("NullpointerException");
		}
		catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
		}
		catch(StringIndexOutOfBoundsException e) {
		System.out.println("StringIndexOutOfBoundsException e");
		}
		
		finally {
			System.out.println("Its mandatory to execute irrespective of their exception");
			System.out.println("program ends");
		}
	

}
}
