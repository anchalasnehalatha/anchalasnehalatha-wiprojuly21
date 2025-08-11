package Day4package1;


public class samepackagesubclass extends employee {
	public void read() {
		System.out.println("reading");
	}
	public static void main(String[] args) {
	samepackagesubclass obj=new samepackagesubclass();
	obj.display();//inherited
	obj.read();//own method
	obj.display1();
	obj.display2();
	
	

}

}
