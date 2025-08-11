package lab24_julycollge;

import lab24_julyemployee1.class1;

public class student {
	//privatevariables
	private static  int stuid=101;
	private static String stuname="sneha";
	private static String studept="cse";
	//privatemethods
	private void fetchstuid() {
		System.out.println("student id is :"+stuid);
	}
	private void fetchstuname() {
		System.out.println("student name is :"+stuname);
	}
	private void fetchstudept() {
		System.out.println("student dept is :"+studept);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		student obj=new student();
		obj. fetchstuid() ;
		obj.fetchstuname();
		obj.fetchstudept() ;

	}
	
	
	

}
