import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class URL02 {
    public static void main(String[] args) {
        try {
            //1.创建链接
            URL url = new URL("http://localhost:8080/examples/1.jpg");
            //2.对连接中的内容进行读写操作的前奏
            URLConnection urlConnection = url.openConnection();
            urlConnection.connect();
            //3.把照片读进来
            InputStream is = urlConnection.getInputStream();
            //4.把照片保存在本地
            FileOutputStream fos = new FileOutputStream("1-1.jpg");
            byte[] bytes = new byte[1024];
            int len=0;
            while ((len=is.read(bytes))!=-1){
                fos.write(bytes,0,len);
            }
            System.out.println("下载完成");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
