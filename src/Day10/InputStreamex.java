package Day10;
import java.io.FileInputStream;

public class InputStreamex {
	public static void main(String[] args) {

	//file inputstream bytes data is read
	try {
	FileInputStream input=new FileInputStream("C://Users//ancha//OneDrive//Desktop//sneha.txt");
			System.out.println("Data in the file");
			//reads the byte
			int i=input.read();
			while(i!=-1) {
				System.out.println((char)i);
	//reads the next byte from the file
	i=input.read();
			}
			input.close();
	}
			catch(Exception e) {
				e.printStackTrace();
			}
	
		
	
	}
}

