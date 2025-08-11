package lab24_julycustomer2;
import lab24_julycustomer1.customerdetails;

public class diffpacksubclass extends customerdetails{
	public void buy() {
		System.out.println("buying product");
	}
	public static void main(String[] args) {
		diffpacksubclass obj=new diffpacksubclass();
		obj.buy();
		obj.fetchcustname();//inherited
		obj.fetchcustid();
		obj.fetchcustdept();
		
		
		
	}
	

}
