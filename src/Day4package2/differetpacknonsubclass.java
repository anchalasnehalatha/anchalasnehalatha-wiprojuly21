package Day4package2;

import Day4package1.employee;

public class differetpacknonsubclass {
	public void write() {
		System.out.println("writing in subclass");
	}
	public static void main(String[] args) {
		employee obj=new employee();
		 differetpacknonsubclass obj1=new  differetpacknonsubclass();
		obj1.write();
		obj.display();
		obj.display1();
		obj.display2();
		
	}

}
