package lab30_july;

import java.util.HashSet;

public class Hashsetexample {
	public static void main(String[] args) {
		//noduplicates 
		//randomorder
		//Multiple nulls are are allowed but it gives only onetime
		//not synchronized
		//operations are faster
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(10);
		hs.add(20);
		hs.add(30);
		hs.add(16);
		hs.add(40);
		hs.add(70);
		hs.add(70);
		hs.add(null);
		hs.add(null);
		System.out.println(hs);
	} 

}
