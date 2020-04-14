import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class writer01 {
    public static void main(String[] args) throws IOException {
        OutputStreamWriter os = new OutputStreamWriter(new FileOutputStream("a.txt"), "utf-8");
        os.write("123");
        os.close();
    }
}
