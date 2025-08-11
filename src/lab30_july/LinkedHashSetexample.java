package lab30_july;

import java.util.LinkedHashSet;

public final class LinkedHashSetexample {
	public static void main(String[] args) {
		//no duplicates
		//preserves the order
		//only one nullvalue is allowed
		//not synchronized
		//performance is slightly slower
		LinkedHashSet<String> lhs=new LinkedHashSet();
		lhs.add("sneha");
		lhs.add("latha");
		lhs.add("sai");
		lhs.add("Mahi");
		lhs.add("Yashu");
		lhs.add("Cherry");
		lhs.add("sneha");
		lhs.add(null);
		lhs.add("null");
		lhs.add("null");
		System.out.println(lhs);
	} 

}
