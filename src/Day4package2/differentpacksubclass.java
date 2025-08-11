package Day4package2;
import Day4package1.employee;

public class differentpacksubclass extends employee{
		public void create() {
			System.out.println("creating ");
		}
	public static void main(String[] args) {
		differentpacksubclass obj=new differentpacksubclass();
		obj.create();
		obj.display();
		obj.display1();
		obj.display2();
		
	}

		
		

	}



