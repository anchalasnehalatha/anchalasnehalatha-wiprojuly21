package lab30_july;

import java.util.LinkedList;
import java.util.Queue;

public class QueueusingLinkedList {
public static void main(String[] args) {
	Queue<String> lang=new LinkedList<>();
	//addelements
	lang.add("python");
	lang.add("java");
	lang.add("C");
	lang.add("C++");
	System.out.println(lang);
	//access the firstelement
	System.out.println(lang.peek());
	System.out.println(lang);
	System.out.println(lang.poll());
	System.out.println(lang);
	System.out.println(lang.remove("C"));
	System.out.println(lang);
	
}
}
