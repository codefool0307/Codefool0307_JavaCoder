import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class reader {
    public static void main(String[] args) throws IOException {
        InputStreamReader is = new InputStreamReader(new FileInputStream("a.txt"));
        int len=0;
        char[] chars = new char[1024];
        while ((len=is.read(chars))!=-1){
            System.out.println(new String(chars,0,len));
        }
    }
}
