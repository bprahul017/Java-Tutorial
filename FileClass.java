import java.io.File;

public class FileClass {
    public static void main(String[] args) {
        File file = new File("text/secret_text.txt");

        if(file.exists()){
            System.out.println("File Exists");
            System.out.println(file.getPath());
            System.out.println(file.getAbsolutePath());
            System.out.println(file.isFile());
            file.delete();
        }
        else {
            System.out.println("File doesn't Exists");
        }
    }
}
