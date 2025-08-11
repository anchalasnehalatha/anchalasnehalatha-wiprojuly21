package Day5;
public class Circle implements circleshape{
	//method coming from interfaceshape
	public void draw() {
		System.out.println("Drawing circle");
	}
	//method coming from circleshape
	public void radius() {
		System.out.println("Radius is 5 units");
	}
	public static void main(String[] args) {
		Circle c=new Circle();
		c.draw();
		c.radius();
	}

}
