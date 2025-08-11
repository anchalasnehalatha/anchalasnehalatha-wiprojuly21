package Day3;

public class singlechildclass extends singlesuper {
   String model="Mustang";
	public void display() {
		System.out.println("Brand is "+brand);
		System.out.println("Model is "+model);
	}
	public static void main(String[] args) {
		singlechildclass obj=new singlechildclass();
		obj.start();
		obj.display();
}
}
