import java.io.IOException;
import java.io.PrintStream;

public class print {
    public static void main(String[] args) throws IOException {
        PrintStream ps = new PrintStream("e.txt");
        ps.write(78);
        ps.write("/r/n".getBytes());
        ps.println("HK");
        System.setOut(ps);
    }
}
