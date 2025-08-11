package Day9;

import java.util.LinkedList;

public class LinkedListexample {
	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList();
		l1.add("ravi");
		l1.add("John");
		l1.add("Tina");
		l1.add("Peter");
		l1.add("Ram");
		System.out.println(l1);
		System.out.println(l1.get(2));
		System.out.println(l1.isEmpty());
		System.out.println(l1.remove("Peter"));
		System.out.println(l1);
	}

}
