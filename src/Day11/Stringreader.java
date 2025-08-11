package Day11;

import java.io.StringWriter;

public class Stringreader {
    public static void main(String[] args) {
        try {
            StringWriter writer = new StringWriter();
            writer.write("Hello from stringwriter!"); // write data
            System.out.println(writer.toString());    // print stored content
            writer.close(); // optional for StringWriter
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
