package Day5;

public class Methodoverloading {
	//It is the concept of developing multiplemethods in a class with samethodname but different parmeters.
	public int  add(int a,int  b) {
		int c=a+b;
		return c;
	}
	public double add(double a,double  b,double c) {
		double d=a+b+c;
		return d;
	}
	public float add(float a,float  b,float c,float d) {
		float e=a+b+c+d;
		return e;
	}
public double add(int a,double b) {
	return a+b;
}
	public static void main(String[] args) {
		Methodoverloading obj= new Methodoverloading();
		System.out.println(obj.add(1, 2));
		System.out.println(obj.add(1.89d, 2.76d,3.9d));
		System.out.println(obj.add(1.0f, 2.0f,3.0f,4.0f));
		System.out.println(obj.add(1,2.067d));
		
		
	}
}


