package Day10;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class comparatorsubclass implements Comparator<employee>{
	public int compare(employee e1,employee e2) {
			//return e1.name.compareTo(e2.name);//Ascendingorder
		return e2.name.compareTo(e1.name);//descendingorder
			
		}
		
	
public static void main(String[] args) {
	List<employee> employee=new ArrayList<>();
	employee.add(new employee(103,"Ravi"));
	employee.add(new employee(101,"Amit"));
	employee.add(new employee(102,"Raju"));
	employee.add(new employee(104,"sai"));
	Collections.sort(employee,new comparatorsubclass());
	for (employee emp:employee) {
		System.out.println(emp);
	}

}
}