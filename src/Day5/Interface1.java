package Day5;

public interface Interface1 {
	//abstractmethods
	abstract void display();
	void read();
	//staticmethod(allowed after 1.8version)
	static void write() {
		System.out.println("Writing in interface");
	}
	//default(allowed after 1.8version)
	default void show() {
		System.out.println("showing");
	}
	public static final String empname="sneha";
	int empid=101;
	
	

}
