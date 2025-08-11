package Day11;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterReader {
    public static void main(String[] args) throws IOException {
        // Write to the file
        BufferedWriter bw = new BufferedWriter(new FileWriter("C://Users//ancha//OneDrive//Desktop//sneha.txt"));
        bw.write("I am buffered reader and write");
        bw.close();

        // Read the file
        BufferedReader br = new BufferedReader(new FileReader("C://Users//ancha//OneDrive//Desktop//sneha.txt"));
        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
