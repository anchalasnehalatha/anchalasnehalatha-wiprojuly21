package practiseprograms;
/*class Ajio{
	void payment(String upi) {
		System.out.println("upi payment");
	}
	void payment(long card) {
		System.out.println("card payment");
	}
	void payment() {
		System.out.println("cash and delivery payment");
	}
}

public class mainclass2 {
	public static void main(String[] args) {
	Ajio a=new Ajio();
	a.payment();
	a.payment("sneha@123");
	a.payment(1234567654);

}
}*/
 class overloading{
	public int add(int a,int b) {
		int c=a+b;
		return c;
	}
	public double add(double a,double b) {
		double c=a+b;
		return c;
	}
	public String add(String a,String b) {
		String c=a+b;
		return c;
	}
	public String add(int a,String b) {
		String c=a+b;
		return c;
	}

		public static void main(String[] args) {
			overloading o=new overloading();
			System.out.println(o.add(12, 10));
			System.out.println(o.add(1.0, 2.0));
			System.out.println(o.add("sneha", "latha"));
			System.out.println(o.add("10", "20.4"));
		}
	}
