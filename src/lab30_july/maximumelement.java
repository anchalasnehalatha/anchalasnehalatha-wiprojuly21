package lab30_july;
//5.Write a program to find the maximum element from an ArrayList of Integers.
import java.util.ArrayList;

public class maximumelement {
	public static void main(String[] args) {
	// Create an ArrayList and add numbers
		        ArrayList<Integer> numbers = new ArrayList<>();
		        numbers.add(15);
		        numbers.add(50);
		        numbers.add(25);
		        numbers.add(10);
		        numbers.add(30);

		        //doing  Initialize max with smallest possible value
		        int max = Integer.MIN_VALUE;

		        
		        for (int num : numbers) {
		            if (num > max) {
		                max = num;
		            }
		        }

		        // Print the maximum element
		        System.out.println("Maximum element is: " + max);
		    }
		}

		
	
