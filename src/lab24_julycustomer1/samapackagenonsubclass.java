package lab24_julycustomer1;


public class samapackagenonsubclass {
	public void write() {
		System.out.println("writing in subclass");
	}
	public static void main(String[] args) {
		customerdetails obj=new customerdetails();
		samapackagenonsubclass obj1=new samapackagenonsubclass();
		obj1.write();
		obj.fetchcustname();//inherited
		obj.fetchcustid();
		obj.fetchcustdept();
	}

}
