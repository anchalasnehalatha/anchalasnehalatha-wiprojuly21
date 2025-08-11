package lab24_julycustomer1;
public class samepacknonsubclass {

	public void write() {
		System.out.println("writing in subclass");
	}
	public static void main(String[] args) {
		defaultdata obj=new defaultdata();
		samepacknonsubclass obj1=new samepacknonsubclass();
		obj1.write();
		obj.fetchgamename();
		obj.fetchgameid();
		obj.fetchgametype();
		
		
	}
}


