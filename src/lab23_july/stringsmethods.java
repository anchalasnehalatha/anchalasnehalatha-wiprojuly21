package lab23_july;

public class stringsmethods {
	public static void main(String[] args) {
		String s1 = "Core Java";
		String s2 = "Selenium";
		//equals
		System.out.println(s1.equals(s2));
		//equalsIgnoreCase
		System.out.println(s1.equalsIgnoreCase(s2));
		//concat
		System.out.println(s1.concat(s2));
		//contains
		System.out.println(s1.contains("J"));
		//substring
		System.out.println(s1.substring(1,3));
		//replace
		System.out.println(s1.replace("J", "j"));
		//replaceAll
		System.out.println(s1.replaceAll(s1,"seleniumtesting"));
		//isEmpty
		System.out.println(s1.isEmpty());
		//endsWith
		System.out.println(s1.endsWith("e"));
		//join
		String str3=s1.join("-", "language","Core Java");
		System.out.println(str3);
		//compareTo(i.e 67-83=-16)
	    System.out.println(s1.compareTo(s2));
	    //split
		String text="java with seleniumtesting";
		String[] result=text.split(" ");
		for(String str:result) {
	    System.out.println(str + "$");
		}
		
	}
}


