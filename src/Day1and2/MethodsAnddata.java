package Day1and2;

public class MethodsAnddata {
	     // class-level variables
	    String studentName = "Anchalasnehalatha";
	    int rollNumber = 101;
	    String course = "Computer Science";

	    // method to display student info
	    public void displayStudentInfo() {
	        // local variable
	        String college = "XYZ College";
	        System.out.println("Student Name: " + studentName);
	        System.out.println("Roll Number: " + rollNumber);
	        System.out.println("Course: " + course);
	        System.out.println("College: " + college);
	    }
	public static void main(String[] args) {
		MethodsAnddata student = new MethodsAnddata();
	        student.displayStudentInfo();
	    }
	}


