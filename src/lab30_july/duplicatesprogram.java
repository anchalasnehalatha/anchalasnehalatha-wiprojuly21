package lab30_july;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//1.Create a set  and  find Duplicate Elements in set

public class duplicatesprogram {
	public static void main(String[] args) {
		
		List<Integer> s=new ArrayList<>();
		s.add(10);
		s.add(23);
		s.add(30);
		s.add(10);
		s.add(56);
		s.add(12);
		s.add(56);
		s.add(10);
		Set<Integer> unique=new HashSet<>();
		Set<Integer> duplicate=new HashSet<>();
		for(Integer value:s) {
			if(!unique.add(value)) {
				duplicate.add(value);
			}
		}
		System.out.println(unique);
		System.out.println(duplicate);
	}

}
