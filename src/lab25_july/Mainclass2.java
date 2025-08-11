package lab25_july;
interface Animal{
	void bark();
}
class Dog implements Animal{
	@Override
	public void bark() {
		System.out.println("Dog is barking");
	}
}

public class Mainclass2 {
	public static void main(String[] args) {
		Dog d=new Dog();
		d.bark();
	}

}
