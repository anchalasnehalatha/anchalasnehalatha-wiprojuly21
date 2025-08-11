package Day3;

public class Strings {
	public static void main(String[] args) {
		
	
//strings creation in 3 ways:
		//1
	String s1="Hello world";
	System.out.println(s1);
	//2
	char[] ch= {'h','e','l','l','o'};
	String s2=new String(ch);
	System.out.println(ch);
	//3
	String s3=new String("Hello");
	System.out.println(s3);
//String methods:equals,concatenation,substring,contains,replace,isempty,join,endwith,compareto,split
	String str1="Mumbai";
	String str2="Delhi";
	//equals
	System.out.println(str1.equals(str2));
	//equalsIgnoreCase
	System.out.println(str1.equalsIgnoreCase(str2));
	//concat
	System.out.println(str1.concat(str2));
	//contains
	System.out.println(str1.contains("z"));
	//substring
	System.out.println(str1.substring(1,3));
	//replace
	System.out.println(str1.replace("i", "g"));
	//replaceAll
	System.out.println(str1.replaceAll(str1,"pune"));
	//isEmpty
	System.out.println(str1.isEmpty());
	//endsWith
	System.out.println(str1.endsWith("e"));
	//join
	String str3=str1.join("_", "city","Mumbai");
	System.out.println(str3);
	//compareTo
    System.out.println(str2.compareTo(str3));
    //split
	String text="java is a programming language";
	String[] result=text.split(" ");
	for(String str:result) {
    System.out.println(str + ",");
	}
	
}
}
