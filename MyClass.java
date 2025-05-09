import java.io.File;

public class MyClass {
    public static void main(String[] args) throws Exception {
        System.out.println("File Handling in Java");
         File file = new File("abc.txt");
         file.createNewFile();
        System.out.println(file.exists());
        FileWriter fw = new FileWriter(file);
        fw.write("Hi I am Coding Wallah Sir")
        fw.close();

        FileReader fr = new FileReader(file);
        System.out.println(fr.read());
    }
}
