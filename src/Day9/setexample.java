package Day9;

import java.util.Set;
import java.util.TreeSet;

public class setexample {
	public static void main(String[] args) {
		Set<String> st=new TreeSet<String>();
		//no duplicates allowed
		//no  null values are allowed
		st.add("Orange");
		st.add("Apple");
		st.add("Grapes");
		st.add("Banana");
		st.add(null);
		st.add("PineApple");
		st.add("null");
		st.add("null");
		System.out.println(st);
		st.remove("PineApple");
		System.out.println(st);
		System.out.println(st.isEmpty());
		System.out.println(st.size());
		
	}

}
