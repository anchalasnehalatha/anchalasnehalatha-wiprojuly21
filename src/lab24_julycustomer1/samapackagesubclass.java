package lab24_julycustomer1;


public class samapackagesubclass extends customerdetails {
	public void read() {
		System.out.println("reading");
	}
	public static void main(String[] args) {
		samapackagesubclass obj=new samapackagesubclass();
		obj.read();//own method
		obj.fetchcustname();//inherited
		obj.fetchcustid();
		obj.fetchcustdept();
		
		
		

	}

}
