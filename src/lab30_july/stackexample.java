package lab30_july;

import java.util.Stack;

public class stackexample {
	public static void main(String[] args) {
		Stack<String> s=new Stack();
		//push
		s.push("Apple");
		s.push("Mango");
		s.push("Banana");
		System.out.println(s);
		
		//pop
		System.out.println(s.pop());
		
		//peek
		System.out.println(s.peek());
		System.out.println(s);
		
		
		//empty
		System.out.println(s.empty());
		
		//search---by following LIFO Principle
		System.out.println(s.search("Apple"));
		
		//add
		System.out.println(s.add("guava"));
		
		//addAll
		Stack<String> s2 = new Stack<>();
        s2.add("Fig");
        s2.add("Grapes");
        s.addAll(s2);
        System.out.println("After addAll: " + s);
        
      //hashcode---first it converts into array then gives hashcodevalue
        System.out.println(s.hashCode());
	
		
		//indexOf
        System.out.println(s.indexOf("Apple"));
		
		//sort
        s.sort(null);
        System.out.println(s);
        
    	//clear
        s.clear();
        System.out.println(s);
		
		
	}

}
