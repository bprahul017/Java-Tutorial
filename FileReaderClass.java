import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
    public static void main(String[] args) throws FileNotFoundException {
        try {
            FileReader reader = new FileReader("text/secret_text.txt");
            int data = reader.read();
            while (data != -1){
                System.out.print((char)data);
                data= reader.read();
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
