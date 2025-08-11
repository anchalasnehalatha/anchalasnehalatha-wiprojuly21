package Day5;

public class Encapsulation {
	//private fields
	private String name;
	private int age;
	
	//public getter method for name
	public String getname() {
		return name;
	}
	//public getter method for age
	public int getage() {
		return age;
	
	}
	//public setter method for name
	public void setname(String name) {
		this.name=name;
	}
	//public setter method for age
		public void setage(int age) {
			this.age=age;
		}



public static void main(String[] args) {
	Encapsulation en=new Encapsulation();
	en.setname("sneha");
	en.setage(23);
	System.out.println("Name is :"+en.getname());
	System.out.println("Age is :" +en.getage());
	
	
		
	}
}
