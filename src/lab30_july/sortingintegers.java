package lab30_july;
//2.Create a Arraylist and sort a list of integers

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class sortingintegers {
	public static void main(String[] args) {
		List<Integer> l1=new ArrayList<>();
		l1.add(10);
		l1.add(4);
		l1.add(45);
		l1.add(67);
		l1.add(2);
		Set<Integer> s=new HashSet<>(l1);
		System.out.println(s);
		
	}

}
