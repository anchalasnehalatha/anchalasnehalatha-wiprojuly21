package practiseprograms;
//single
//multilevel
//hirarchial
//multiple
class A{
	int a=10;
	public void start() {
		System.out.println("method is starting");
	}
}
class B extends A{
	int a=20;
	public void eat() {
		System.out.println("eating");
	}
}
class C extends A{
	public void run() {
		System.out.println("running");
	}
}

public class mainclass1 {
	public static void main(String[] args) {
		A a=new A();
		a.start();
		System.out.println(a.a);
		B b=new B();
		System.out.println(b.a);
		b.start();
		b.eat();
		C c=new C();
		c.start();
		c.run();
	}

}
