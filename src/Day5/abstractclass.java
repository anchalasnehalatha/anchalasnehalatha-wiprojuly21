package Day5;

abstract class abstractclass {
	//abstractmethods-nobody
	abstract void makesound();
	//concretemethods
	void eat() {
		System.out.println("The animal eats food");
	}
	//constructor
	abstractclass(){
		System.out.println("creating constructor in abstractclass");
	}
	//instance variables
	public static String animalName="Lion";
	//finalvariable
	private final String animalbehaviour="roars";
	
	
	
	

}
