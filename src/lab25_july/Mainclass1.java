package lab25_july;

interface Shape {
	void getarea();

}
//subclass
 class Rectangle implements Shape {
	 double l;
	 double b;
	 Rectangle(double l,double b){
		 this.l=l;
		 this.b=b;
	 }
	@Override
	public void getarea() {
		double area=l*b;
		System.out.println("Drawing rectangle :"+area);
	}

}
 //subclass
 class Circle implements Shape {
	 double radius;
	 Circle(double radius){
		 this.radius=radius;
	 }
	@Override
	public void getarea() {
		double area=22/7*radius*radius;
		System.out.println("Drawing circle : "+area);
	}

}
 //subclass
class Triangle implements Shape {
	int base;
	int height;
	Triangle(int base,int height){
		this.base=base;
		this.height=height;
	}
	@Override
	public void getarea() {
		double area=0.5*base*height;
		System.out.println("Drawing triangle : "+area);
	}

}
public class Mainclass1{
	public static void main(String[] args) {
		Circle c=new Circle(2.4);
		c.getarea();
		Rectangle r=new Rectangle(2,4);
		r.getarea();
		Triangle t=new Triangle(2,5);
		t.getarea();
		
	}
}

