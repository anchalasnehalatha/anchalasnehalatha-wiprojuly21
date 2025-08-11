package lab24_july;

abstract class employee {
	String name;
	int id;
	//constructor
	employee(String name,int id){
		this.name=name;
		this.id=id;
	}
	//abstractmethod
	abstract void calculatesalary();

}
//subclass
class permanentemployee extends employee{
	double sal;
	permanentemployee(String name,int id,double salary){
		super(name,id);
		this.sal=salary;
		
	}
	@Override
	void calculatesalary() {
		System.out.println("employee name is : "+ name +  " and id is : " +id);
	}
}
//subclass
class contractemployee extends employee{
	double hourlyrate;
	int hoursworked;
	contractemployee(String name,int id,double hourlyrate,int hoursworked){
		super(name,id);
		this.hourlyrate=hourlyrate;
		this.hoursworked=hoursworked;
	}
	@Override
	void calculatesalary() {
		double salary=hourlyrate*hoursworked;
		System.out.println("Contract Employee Salary for " + name + ": " + salary);
	}
}

