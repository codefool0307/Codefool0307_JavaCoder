import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Out2 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("b.txt");
        //A  放入多个字符
        byte[] bytes = {98,99,100};
        fos.write(bytes);
        //B  放入字符串
        byte[] bytes1="大哥让我来巡山了".getBytes();
        fos.write(bytes1);
        fos.close();

    }
}
