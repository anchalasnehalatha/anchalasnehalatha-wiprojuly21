package Day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

 class Equalsmethod {
	int id;
	String name;
	Equalsmethod(int id,String name){
		this.id=id;
		this.name=name;
	}
	//overriding equal() to compare the object content
	@Override
	public boolean equals(Object obj) {
		if(this==obj)return true;//same reference
		if(obj==null ||getClass()!=obj.getClass()) return false;
	
	employee other=(employee)obj;
	return this.id==other.id && this.name.equals(other.name);
	}
	@Override
	public int hashCode() {
		return Objects.hash(id,name);
	}
	@Override
	public String toString() {
		return id + "_" +name;
	}
	public static void main(String[] args) {
		List<employee> employees=new ArrayList<>();
		employees.add(new employee(103,"Ravi"));
		employees.add(new employee(101,"Amit"));
		employees.add(new employee(102,"Zara"));
		employees.add(new employee(102,"Zara"));
		employees.add(new employee(104,"John"));
		for(employee e:employees) {
			System.out.println(e);
		}
	}

}
 

