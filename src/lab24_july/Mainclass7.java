package lab24_july;
abstract class Student{
	String name;
	int rollno;
	Student(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
	}
	abstract void getgrade();
}
//subclass1
class engineeringstudent extends Student{
	int marks;
	 engineeringstudent(String name,int rollno,int marks){
		 super(name,rollno);
		 this.marks=marks;
	 }
	 @Override
	 void getgrade() {
		 System.out.println("name is : " +name + "rollno is " +rollno);
		 if (marks >= 85) {
	            System.out.println("Grade: A");
	        } else if (marks >= 70) {
	            System.out.println("Grade: B");
	        } else if (marks >= 50) {
	            System.out.println("Grade: C");
	        } else {
	            System.out.println("Grade: Fail");
	        }
		 
	 }
	
	
}
//subclass2
class medicalstudent extends Student{
	int marks;
	 medicalstudent(String name,int rollno,int marks){
		 super(name,rollno);
		 this.marks=marks;
	 }
	 @Override
	 void getgrade() {
		 System.out.println("name is:" +name+ "rollno is :" +rollno);
		 if (marks >= 90) {
	            System.out.println("Grade: A");
	        } else if (marks >= 75) {
	            System.out.println("Grade: B");
	        } else if (marks >= 60) {
	            System.out.println("Grade: C");
	        } else {
	            System.out.println("Grade: Fail");
	        }
		
	 }
	 
	
	
}
	

public class Mainclass7 {
	public static void main(String[] args) {
		engineeringstudent es=new engineeringstudent("sneha",101,60);
		es.getgrade();
		medicalstudent md=new medicalstudent("latha",102,90);
		md.getgrade();
	}

}
