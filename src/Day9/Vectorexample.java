package Day9;

import java.util.Vector;

public class Vectorexample {
	public static void main(String[] args) {
		//growablearray
		//zerobasedindex
		//maintains the insertionorder
		//stores duplicate elements
		//capacity increament
		//nullvalues allowed
		
		Vector<String> v=new Vector<>();
		//adding elements
		v.add("sneha");
		v.add("latha");
		v.add("sai");
		v.add("mahi");
		v.add("yashu");
		v.add("pandu");
		v.add("nandu");
		v.add("cherry");
		System.out.println(v);
		//add using index
		v.add(1,"reddy");
		System.out.println(v);
		//getting indexelement
		System.out.println(v.get(3));
		//remove through index
		System.out.println(v.remove(2));
		System.out.println(v);
		//removing object
		v.remove("latha");
		System.out.println(v);
		//size
		System.out.println(v.size());
		//isEmpty
		System.out.println(v.isEmpty());
		//ElementAt
		System.out.println(v.elementAt(0));
	}

}
