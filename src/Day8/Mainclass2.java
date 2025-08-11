package Day8;

 class InvalidMobileNumberException extends Exception {
	 

}
 class mobilenumverifier {
	 static void checkmobilenumber(String num)throws InvalidMobileNumberException{
		 if(num.length()!=10) {
			 throw new InvalidMobileNumberException();
			 
		 }
		 
	 }
 }
public class Mainclass2{
	 public static void main(String[] args) {
		try{
			mobilenumverifier.checkmobilenumber("70130737446");
	}
		catch(InvalidMobileNumberException e) {
			System.out.println("Invalidmobile number exception");
		}
 }
 }
