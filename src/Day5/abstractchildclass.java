package Day5;

public class abstractchildclass extends abstractclass {

	@Override
	void makesound() {
		System.out.println("Animal is making sound");
		
	}
	public static void main(String[] args) {
		abstractchildclass obj=new abstractchildclass();
		obj.eat();
		obj.makesound();
		System.out.println(obj.animalName);
		
	}

}
