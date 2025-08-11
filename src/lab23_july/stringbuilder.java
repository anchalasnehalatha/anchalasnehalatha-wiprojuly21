package lab23_july;

public class stringbuilder {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("Corejava");
		System.out.println(sb);
		// It is mutable in  nature
		//append
		sb.append("language");
		System.out.println(sb);
		//methods:reverse,isEmpty,insert,delete,substring,replace,charAt,IndexOf,Length,Repeat
		//reverse
		//System.out.println(sb.reverse());
		//isEmpty
		System.out.println(sb.isEmpty());
		//insert(position,character to insert)
		System.out.println(sb.insert(16,"s"));
		//delete(stratindex,endindex)
		StringBuffer sb1=new StringBuffer("welcometojava") ;
		sb1.delete(0,7);
		System.out.println(sb1);
		//substring
		System.out.println(sb1.substring(0,3));
		//replace(startindex,endindex,character)
		System.out.println(sb1.replace(0,1,"abc"));
		//charAtindex
		System.out.println(sb1.charAt(2));
		//IndexOf
		System.out.println(sb1.indexOf("W"));
		//Length
		System.out.println(sb1.length());
		//repeat
		System.out.println(sb1.repeat(sb1, 3));
		
	}

}


