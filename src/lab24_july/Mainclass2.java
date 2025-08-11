package lab24_july;

public class Mainclass2 {
		public static void main(String[] args) {
			permanentemployee pe=new permanentemployee("sneha",101,40000);
			pe.calculatesalary();
			contractemployee ce=new contractemployee("sneha",101,500,12);
			
			ce.calculatesalary();
		}
	}


