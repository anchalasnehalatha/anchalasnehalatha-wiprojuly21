package lab23_july;

public class stringbuffer {
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("hello");
		System.out.println(sb);
		// It is mutable in  nature
		//append
		//sb.append("Helloworld");
		//System.out.println(sb);
		//methods:reverse,isEmpty,insert,delete,substring,replace,charAt,IndexOf,Length,Repeat
		//reverse
		System.out.println(sb.reverse());
		//isEmpty
		System.out.println(sb.isEmpty());
		//insert(position,character to insert)
		System.out.println(sb.insert(1,"a"));
		//delete(stratindex,endindex)
		StringBuffer sb1=new StringBuffer("helloworld") ;
		sb1.delete(0,5);
		System.out.println(sb1);
		//substring
		System.out.println(sb1.substring(0,3));
		//replace(startindex,endindex,character)
		System.out.println(sb1.replace(0,1,"W"));
		//charAtindex
		System.out.println(sb1.charAt(2));
		//IndexOf
		System.out.println(sb1.indexOf("W"));
		//Length
		System.out.println(sb1.length());
		//repeat
		System.out.println(sb1.repeat(sb1, 5));
		
	}

}
