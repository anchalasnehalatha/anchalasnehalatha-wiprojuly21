package practiseprograms;
class parent{
	public void run() {
		System.out.println("parent is running");
	}
}
class child extends parent{
	@Override
	public void run() {
		System.out.println("child is running");
	}
}
public class mainclass2 {
	public static void main(String[] args) {
		parent p=new parent();
		p.run();
		p=new child();
		p.run();
		
	}

}
