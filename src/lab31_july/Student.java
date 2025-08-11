package lab31_july;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
    int rollnumber;
    String name;

    public Student(int rollnumber, String name) {
        this.rollnumber = rollnumber;
        this.name = name;
    }

    
    public int compareTo(Student s) {
        return this.name.compareTo(s.name);
    }

    public String toString() {
        return rollnumber + "_" + name;
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(107, "Ravi"));
        students.add(new Student(102, "Amit"));
        students.add(new Student(103, "Zara"));
        Collections.sort(students); // Sorts by name
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
