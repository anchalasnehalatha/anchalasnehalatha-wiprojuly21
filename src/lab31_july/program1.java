package lab31_july;

public class program1 {
	public static void main(String[] args) {
		String input="aabbbcccc";
		String output="";
		int count=1;
		for(int i=0;i<input.length()-1;i++) {
			if(input.charAt(i)==input.charAt(i+1)) {
				count++;
				
			}else {
				output=output+input.charAt(i)+count;
				count=1;
			}
		}
		 output =output + input.charAt(input.length() - 1) + count;

	        System.out.println(output);
		
	} 

}
