package Day8;
public class Garbagecollection {
	public void finalize() {
		System.out.println("object is garbage collected");
	}
	public static void main(String[] args) {
		//by nulling the reference
		Garbagecollection obj=new Garbagecollection();
		obj=null;
		//by assigning reference to another object
		Garbagecollection obj1=new Garbagecollection();
		Garbagecollection obj2=new Garbagecollection();
		obj1=obj2;
		//object is out of scope
		Garbagecollection obj4=new Garbagecollection();
		
		
		//we can call in 2 ways:
		//firstway is 
		  //System.gc();
		//secondway by using runtime
		Runtime.getRuntime().gc();
		
		
	}

}
