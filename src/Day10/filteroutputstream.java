package Day10;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

public class filteroutputstream {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        FilterOutputStream filterOut = null;

        try {
            fos = new FileOutputStream("C://Users//ancha//OneDrive//Desktop//sneha.txt");
            filterOut = new BufferedOutputStream(fos);
            String text = "Hii who are you";
            filterOut.write(text.getBytes());
            filterOut.flush(); // ensure data is written
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                if (filterOut != null) filterOut.close();
                if (fos != null) fos.close();
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}
