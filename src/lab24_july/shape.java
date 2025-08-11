package lab24_july;

abstract class shape {
	
	
	abstract void calculatearea();

}
//subclass
class circle extends shape {
	double radius;
	circle(double radius){
		this.radius=radius;
	}
	@Override
	void calculatearea() {
		double area=22/7*radius*radius;
		System.out.println("Area of circle is " +area);
	}
	
}
class rectangle extends shape {
	double l,b;
	rectangle(double l,double b){
		this.l=l;
		this.b=b;
	}
	@Override
	void calculatearea() {
		double area=l*b;
		System.out.println("Area of rectangle is " +area);
	}
	
}
