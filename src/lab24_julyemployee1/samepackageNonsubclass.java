package lab24_julyemployee1;

public class samepackageNonsubclass {

	public void write() {
		System.out.println("writing in subclass");
	}
	public static void main(String[] args) {
		class1 obj=new class1();
		samepackageNonsubclass obj1=new samepackageNonsubclass();
		obj.display();
		obj1.write();
		obj.fetchempid();
		obj.fetchempadd();
	}
}
