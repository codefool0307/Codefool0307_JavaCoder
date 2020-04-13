import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Out03 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("a.txt", false);
        for (int i = 0; i < 10; i++) {
            byte[] bytes1="你好".getBytes();
            byte[] bytes2="\r\n".getBytes();
            fos.write(bytes1);
            fos.write(bytes2);
        }
        fos.close();
    }
}
