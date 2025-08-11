package lab24_julyemployee2;
import lab24_julyemployee1.class1;

public class diffpackNonsubclass {
	public void print() {
		System.out.println("printing");
	}
	public static void main(String[] args) {
		class1 obj=new class1();
		diffpackNonsubclass obj1=new diffpackNonsubclass();
		obj.display();
		obj1.print();
		
		
	}

}
