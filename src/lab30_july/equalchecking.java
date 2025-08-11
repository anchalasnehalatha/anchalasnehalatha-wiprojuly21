package lab30_july;
import java.util.LinkedList;
public class equalchecking {
	public static void main(String[] args) {
		        // creating First LinkedList
		        LinkedList<Integer> list1 = new LinkedList<>();
		        list1.add(10);
		        list1.add(20);
		        list1.add(30);

		        // creating Second LinkedList
		        LinkedList<Integer> list2 = new LinkedList<>();
		        list2.add(10);
		        list2.add(20);
		        list2.add(70);

		        // Checking  if both lists are equal
		        if (list1.equals(list2)) {
		            System.out.println("Both LinkedLists are equal.");
		        } else {
		            System.out.println("LinkedLists are not equal.");
		        }
		    }
		

	

}
