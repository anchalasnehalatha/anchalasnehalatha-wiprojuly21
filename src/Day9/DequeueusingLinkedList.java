package Day9;
import java.util.Deque;
import java.util.LinkedList;

public class DequeueusingLinkedList {
    public static void main(String[] args) {
        Deque<String> deque = new LinkedList<>();

        // Add elements 
        deque.addFirst("Java");
        deque.addLast("Python");
        deque.addFirst("C++");
        deque.addLast("JavaScript");

        System.out.println("Deque after additions: " + deque); 

        //get elements
        System.out.println("First element: " + deque.getFirst()); 
        System.out.println("Last element: " + deque.getLast());    

        // Remove elements
        deque.removeFirst();  
        deque.removeLast();  

        System.out.println("Deque after removals: " + deque); 
    }
}
