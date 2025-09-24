import java.io.FileWriter;
import java.io.IOException;

public class FileWriterClass {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("text/written.txt");
            writer.write("Hello World \nI'm writing new files");
            writer.append("\nNew line appended");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
