package lab25_july;

public class employee {
	private String name;
	private int age;
	private double salary;
	//constructor
	employee(String name,int age,double salary){
		this.name=name;
		this.age=age;
		this.salary=salary;
	}
	//settermethod for salaryvalidation
	public void setsalary(double salary) {
		if(salary>0) {
			this.salary=salary;
		}
		else {
			System.out.println("Invalid salary");
		}
	}
	public void displaydetails() {
		System.out.println("Name is :" +name);
		System.out.println("Age is :" +age);
		System.out.println("Salary is :" +salary);
		System.out.println("----------------------");
	}
public static void main(String[] args) {
	employee e1=new employee("sneha",23,10000);
	employee e2=new employee("latha",24,20000);
	employee e3=new employee("anchala",25,30000);
	e1.displaydetails();
	e2.displaydetails();
	e3.displaydetails();
}
	

}
