package Day3;
 class mainclass1 {
	public void eat() {
		System.out.println("Animals eat food");
	}

}
//subclass1
class Dog extends mainclass1 {
	public void bark() {
		System.out.println("Dog barks");
	}
}
//subclass2
class Cat extends mainclass1 {
		public void meow() {
			System.out.println("cat meows");
		}
 
}
//subclass3
class Cow extends mainclass1 {
	public void moo() {
	System.out.println("cow moos");
			}
	 
	}
//mainclass
class mainclass{
	public static void main(String[] args) {
		Dog d=new Dog();
		d.eat();
		d.bark();
		Cat c=new Cat();
		c.eat();
		c.meow();
		Cow cw=new Cow();
		cw.eat();
		cw.moo();
		
	}
}
