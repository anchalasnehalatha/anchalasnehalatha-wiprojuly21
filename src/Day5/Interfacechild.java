package Day5;

public class Interfacechild implements Interface1 {
	@Override
	public void display() {
		System.out.println("Displaying in child class");
	}
	@Override
	public void read() {
		System.out.println("Reading in childclass");
	}
	public static void main(String[] args) {
		Interfacechild ic=new Interfacechild();
		ic.display();
		ic.read();
		Interface1.write();
		ic.show();
		System.out.println(empname);
		System.out.println(empid);
		
		
	}

}
