package lab30_july;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student>{
	int rollnumber;
	String name;
	//constructor of  the class to pass parametrs
	public Student(int rollnumber,String name) {
		this.rollnumber=rollnumber;
		this.name=name;
		
	}
	//Implement CompareTomethod for naturalordering based on rollno
	public int compareTo(Student s) {
		return this.rollnumber-s.rollnumber;
	}
	public String toString() {
		return rollnumber + "_"+name;
	}
	//sort a list of students by rollnumber
	public static void main(String[] args) {
		List<Student> students=new ArrayList<>();
		students.add(new Student(107,"Ravi"));
		students.add(new Student(102,"Amit"));
		students.add(new Student(103,"Zara"));
		Collections.sort(students);
		for(Student s:students) {
			System.out.println(s);
		}
	}
	

}
