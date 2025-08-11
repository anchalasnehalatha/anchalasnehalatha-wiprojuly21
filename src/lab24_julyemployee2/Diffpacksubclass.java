package lab24_julyemployee2;
import lab24_julyemployee1.class1;

public class Diffpacksubclass extends class1 {
	public void create() {
		System.out.println("creating ");
	}
public static void main(String[] args) {
	Diffpacksubclass obj=new Diffpacksubclass();
	obj.create();
	obj.display();
	obj.fetchempadd();
	
}
}
