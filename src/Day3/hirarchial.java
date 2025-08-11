package Day3;
class A{
	String name="sneha";
	public void start() {
		System.out.println("sneha is studying");
	}
}
class B extends A{
	
	public void eat() {
		System.out.println("sneha is eating");
	}
}
class C extends A{
	
	public void drink() {
		System.out.println("sneha is drinking");
	}
}
class D extends A{
	
	public void play() {
		System.out.println("sneha is playing");
	}
}

public class hirarchial {
	public static void main(String[] args) {
		A a=new A();
		a.start();
		B b=new B();
		b.start();
		b.eat();
		C c=new C();
		c.start();
		c.drink();
		D d=new D();
		d.start();
		d.play();
		
	}

}
