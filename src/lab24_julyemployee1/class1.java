package lab24_julyemployee1;

public class class1 {
	//privatevarible
	private static String empsal="56784";
	//privatemethod
	private void fetchsal() {
		System.out.println("employee sal is " + empsal);
	}
	public void display() {
		System.out.println("Displaying the data");
	}
	//defaultvarible
	int employeeid=2345;
	//defaultmethod
	void fetchempid() {
		System.out.println("The employee id is "+ employeeid);
	}
	//protected variable amd method
	protected String empadd="jaynagar";
	protected void fetchempadd() {
		System.out.println("The emp address is "+ empadd);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		class1 obj=new class1();
		obj.display();
		obj.fetchsal();
		obj.fetchempid();
		obj.fetchempadd();

	}

}
