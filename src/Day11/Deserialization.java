package Day11;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {
    public static void main(String[] args) {
        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("C:/Users/ancha/OneDrive/Desktop/sneha.txt"))) {

            student s = (student) in.readObject();
            System.out.println(s.id + " " + s.name);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
	

