package Day8;

public class predefinedmethodsexception {

	public static void main(String[] args) {
		System.out.println("program starts");
		try {
			System.out.println(10/0);
		}
		catch(ArithmeticException ae) {
			//getmessage give what is the name of the exception.
			String s=ae.getMessage();
			System.out.println(s);
			//printstacktrace gives at which line it isgetting.
			ae.printStackTrace();
		}
		System.out.println("program ends");

	}

}
