package lab30_july;

public class secondlargeinanarray {
	    public static void main(String[] args) {
	        int[] numbers = {10, 20, 5, 8, 30, 25};

	        int largest = Integer.MIN_VALUE;
	        int secondLargest = Integer.MIN_VALUE;

	        for (int num : numbers) {
	            if (num > largest) {
	                secondLargest = largest;
	                largest = num;
	            } else if (num > secondLargest && num != largest) {
	                secondLargest = num;
	            }
	        }

	        if (secondLargest == Integer.MIN_VALUE) {
	            System.out.println("No second largest element found.");
	        } else {
	            System.out.println("Second largest element is: " + secondLargest);
	        }
	    }
	}



