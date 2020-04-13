import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writer {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("d.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("456");
        bw.close();
    }
}
