import java.io.FileWriter;
import java.io.IOException;

public class Writer01 {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("c.txt");
        fw.write(99);
        fw.close();
    }
}
