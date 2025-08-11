package Day4package1;



public class samepackageNonsubclass {
	public void write() {
		System.out.println("writing in subclass");
	}
	public static void main(String[] args) {
		employee obj=new employee();
		samepackageNonsubclass obj1=new samepackageNonsubclass();
		obj.display();
		obj1.write();
		obj.display1();
		obj.display2();
	}
}
