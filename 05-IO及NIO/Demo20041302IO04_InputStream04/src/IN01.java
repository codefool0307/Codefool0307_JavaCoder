import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IN01 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("b.txt");
        int read = fis.read();
        //方式一:一次读取一个字节
          //强转类型
        System.out.println((char)read);
        //方式二：也是一次读取一个字节，但是呢让java处理
        int len=0;
        while ((len=fis.read())!=-1){
            System.out.println((char)len);
        }
        fis.close();
    }
}
