package Day11;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import lab30_july.Student;

public class serialization {
	public static void main(String[] args) {
		//serialization is a process of converting javaobject into stream of bytes
		//write object()
		//creating the object
		try {
		Student s1=new Student(211,"John");
		//creating the outputstream writing the object
		FileOutputStream  fos=new FileOutputStream("C:/Users/ancha/OneDrive/Desktop/sneha.txt");
		ObjectOutputStream out=new ObjectOutputStream(fos);
		out.writeObject(s1);
		out.flush();
		//closing the stream
		fos.close();
		out.close();
		System.out.println("object is closed");
		
	}catch(Exception e) {
		System.out.println(e);
	}

}
}
