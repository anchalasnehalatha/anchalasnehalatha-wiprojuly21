package Day10;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FilterInputStream;

public class fileinputstreamsex {
	public static void main(String[] args) {
		//filter streams filter data s they read and write data in inputstream.
		FileInputStream fis=null;
		FilterInputStream filterinput=null;
		try {
			//create fileinput stream foe the file
			fis=new FileInputStream("C://Users//ancha//OneDrive//Desktop//sneha.txt");
		
		//wrap file inputstream with buffered input steam
		filterinput =new BufferedInputStream(fis);
		//read and print the file content
		int data;
		while((data=filterinput.read())!=-1) {
			System.out.println((char)data);
		}
		fis.close();
		
	}
		
	catch(Exception e) {
		System.out.println(e);
	}

}
}
