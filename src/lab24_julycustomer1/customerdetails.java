package lab24_julycustomer1;

public class customerdetails {
	protected String custname="xyz";
	protected int custid=345;
	protected String custdept="marketing";
	protected void fetchcustname() {
		System.out.println("cust id is :" +custname);
	}
	protected void fetchcustid() {
		System.out.println("cust id is :" +custid);
	}
	protected void fetchcustdept() {
		System.out.println("cust id is :" +custdept);
	

}
	public static void main(String[] args) {
		customerdetails cd=new customerdetails();
		cd.fetchcustname();
		cd.fetchcustid();
		cd.fetchcustdept();
		
		 
		
	}
}